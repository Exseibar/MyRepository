package coupon.system.core.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ConnectionPool {

	public static final int MAX_CONS = 10;

	private Set<Connection> connections = new HashSet<Connection>();
	private String url = "jdbc:mysql://localhost:3306/coupon_sys_db";
	private String user = "root";
	private String pass = "1234";
	private boolean poolOpen;

	private static ConnectionPool instance;

	private ConnectionPool() throws SQLException {
		for (int i = 0; i < MAX_CONS; i++) {
			connections.add(DriverManager.getConnection(url, user, pass));
		}
		System.out.println("System has initialized with: " + connections.size() + " connections");
		poolOpen = true;
	}

	public static ConnectionPool getInstance() throws SQLException {
		if (instance == null) {
			instance = new ConnectionPool();
		}
		return instance;
	}

	public synchronized Connection getConnection() throws SQLException {
		if (!poolOpen) {
			throw new SQLException("Error, Pool is not open");
		}
		while (connections.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				throw new SQLException("error has occurred while waiting for connection...");
			}
		}
		Iterator<Connection> it = connections.iterator();
		Connection con = it.next();
		it.remove();
		// might need to notifyAll after this.
		return con;
	}

	public synchronized void restoreConnection(Connection con) {
		this.connections.add(con);
		notify();
	}

	public synchronized void closeAllConnection() throws SQLException {
		poolOpen = false;
		while (connections.size() < MAX_CONS) {
			try {
				wait();
			} catch (InterruptedException e) {
				throw new SQLException("Error has occurred while waiting to get all connections");
			}
		}
		Iterator<Connection> it = connections.iterator();
		while (it.hasNext()) {
			Connection elem = (Connection) it.next();
			elem.close();
		}
	}
}