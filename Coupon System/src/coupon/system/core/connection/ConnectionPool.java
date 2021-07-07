package coupon.system.core.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import coupon.system.core.exceptions.CouponSystemException;

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
		System.out.println("System has initialized with: " + connections.size());
		poolOpen = true;
	}

	public static ConnectionPool getInstance() throws CouponSystemException {
		if (instance == null) {
			try {
				instance = new ConnectionPool();
			} catch (SQLException e) {
				throw new CouponSystemException("connection pool init failed ", e);
			}
		}
		return instance;
	}

	public synchronized Connection getConnection() throws CouponSystemException {

		if (!poolOpen) {
			throw new CouponSystemException("Error, Pool is not open");
		}
		while (connections.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				throw new CouponSystemException(
						"error has occured while waiting for connection... please try again later.");
			}
		}
		Iterator<Connection> it = connections.iterator();

		Connection con = it.next();

		it.remove();

		return con;
	}

	public synchronized void restoreConnection(Connection con) {
		this.connections.add(con);
		notify();
	}

	public synchronized void closeAllConnection() throws CouponSystemException {
		poolOpen = false;

		while (connections.size() < MAX_CONS) {

			try {
				wait();
			} catch (InterruptedException e) {
				throw new CouponSystemException("Error has occured while waiting to get all connections");
			}
		}

		try {
			for (Connection connection : connections) {
				connection.close();
			}
		} catch (SQLException e) {
			throw new CouponSystemException("Error has occurred while trying to close connections");
		}
	}

}
