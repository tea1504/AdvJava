package advjava.DAO;

import java.sql.ResultSet;
import java.util.ArrayList;

import advjava.bean.DBConnection;
import advjava.bean.Phong;

public class PhongDAO {
	DBConnection conn = new DBConnection();
	public ArrayList<Phong> getPhong(){
		ArrayList<Phong> list = new ArrayList<Phong>();
		String query = "select * from phongmay";
		ResultSet res = conn.excuted(query);
		return list;
	}
}
