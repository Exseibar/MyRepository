package coupon.system.core.tests;

import com.sun.security.jgss.GSSUtil;
import coupon.system.core.connection.ConnectionPool;
import coupon.system.core.exceptions.CouponSystemException;

import java.sql.*;

public class ConnectionTest {
    public static void main(String[] args) {
        Connection con = null;
        try {
            con = ConnectionPool.getInstance().getConnection();
            String sql = "INSERT INTO company VALUES(0,'avi' , 'avi@gmail.com', '123')";
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);
            sql = "SELECT * FROM company";
            stmt = con.createStatement();
            ResultSet rs  = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getString(2));
            }
        } catch(SQLException throwables) {
            throwables.printStackTrace();
        }finally{
            if (con != null){
                try {
                    ConnectionPool.getInstance().restoreConnection(con);
                    ConnectionPool.getInstance().closeAllConnection();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
