package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDataBase {
	public static Connection getDataBaseConnection(){  
		String driver="com.mysql.jdbc.Driver";  
		String url="mysql://localhost:3306/beauty_ssm";  
		String user="root";  
		String password="123456";  

		//加载驱动程序  
		try {  
			Class.forName(driver);  
			//System.out.println("驱动程序加载成功");  
		} catch (ClassNotFoundException e) {  
			e.printStackTrace();  
		}  

		//链接数据库  
		Connection conn=null;  
		try {  
			conn=DriverManager.getConnection(url, user, password);  
			if (!conn.isClosed()) {  
				System.out.println("连接数据库成功");  
			}  
		} catch (SQLException e) {  
			System.out.println("链接数据库失败: "+e.getMessage());  
		}  

		return conn;  
	}
	public static void main(String[] args) {
		getDataBaseConnection();
	}
}
