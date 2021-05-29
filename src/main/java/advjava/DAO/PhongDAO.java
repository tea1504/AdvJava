package advjava.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import advjava.bean.DBConnection;
import advjava.bean.Phong;

public class PhongDAO {
	DBConnection conn = new DBConnection();
	public ArrayList<Phong> getPhong(){
		ArrayList<Phong> list = new ArrayList<Phong>();
		String query = "select * from phongmay";
		conn.getConnection();
		ResultSet res = conn.excuted(query);
		try {
			while(res.next()) {
				list.add(new Phong(res.getString(1), res.getString(2), res.getInt(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		conn.closeConnection();
		return list;
	}
}
