package advjava.view;

import java.util.ArrayList;

import advjava.DAO.GiangVienDAO;
import advjava.DAO.LopDAO;
import advjava.DAO.PhongDAO;
import advjava.bean.GiangVien;
import advjava.bean.Lop;
import advjava.bean.Phong;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GiangVienDAO gv = new GiangVienDAO();
		ArrayList<GiangVien> list = gv.getGiangVien();
		for (GiangVien giangVien : list) {
			System.out.println(giangVien);
			for (Lop lop : giangVien.getDsLop()) {
				System.out.println("\t"+lop);
			}
		}
	}

}
