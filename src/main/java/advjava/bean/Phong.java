package advjava.bean;

public class Phong {
	private String MaPhong;
	private String TenPhong;
	public Phong(String maPhong, String tenPhong, int soMay) {
		super();
		MaPhong = maPhong;
		TenPhong = tenPhong;
		SoMay = soMay;
	}
	private int SoMay;
	public String getMaPhong() {
		return MaPhong;
	}
	public void setMaPhong(String maPhong) {
		MaPhong = maPhong;
	}
	public String getTenPhong() {
		return TenPhong;
	}
	public void setTenPhong(String tenPhong) {
		TenPhong = tenPhong;
	}
	public int getSoMay() {
		return SoMay;
	}
	public void setSoMay(int soMay) {
		SoMay = soMay;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getMaPhong() + "\t" + getTenPhong() + "\t" + getSoMay();
	}
}
