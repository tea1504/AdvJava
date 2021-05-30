package advjava.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
	private Connection conn;
	/**
	 * Lưu mật khẩu kết nối đến CSLDL MySQL
	 */
	static final String PASSWORD = "tn208";
	static final String USERNAME = "javanc";
	static final String URL = "jdbc:mysql://localhost:3308/ql_phongmay";

	/**
	 * Ham khoi tao
	 */
	public DBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Hàm dùng để lấy kết nối để kết nối đến MySQL
	 * 
	 * @return Một kết nối
	 */
	public Connection getConnection() {
		try {
			conn = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	/**
	 * Đóng một kết nối
	 */
	public void closeConnection() {
		if (conn == null) {
			return;
		} else {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * 
	 * @param query
	 * @return
	 * 	null trong trường hợp lỗi<br>
	 * 	tập kết quả
	 */
	public ResultSet excuted(String query) {
		PreparedStatement ps;
		ResultSet rs;
		try {
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public int update(String query) {
		PreparedStatement ps;
		int r;
		try {
			ps = conn.prepareStatement(query);
			r = ps.executeUpdate();
			return r;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
}
