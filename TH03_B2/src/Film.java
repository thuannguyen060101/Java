
public class Film {
	private String tenFilm;
	private int namSanXuat;
	private double giaVe;
	private HangSanXuat hangSanXuat;
	private NgayKhoiChieu ngayKhoiChieu;
	public Film(String tenFilm, int namSanXuat, double giaVe, HangSanXuat hangSanXuat, NgayKhoiChieu ngayKhoiChieu) {
		this.tenFilm = tenFilm;
		this.namSanXuat = namSanXuat;
		this.giaVe = giaVe;
		this.hangSanXuat = hangSanXuat;
		this.ngayKhoiChieu = ngayKhoiChieu;
	}
	public String getTenFilm() {
		return tenFilm;
	}
	public void setTenFilm(String tenFilm) {
		this.tenFilm = tenFilm;
	}
	public int getNamSanXuat() {
		return namSanXuat;
	}
	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	public double getGiaVe() {
		return giaVe;
	}
	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}
	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	public NgayKhoiChieu getNgayKhoiChieu() {
		return ngayKhoiChieu;
	}
	public void setNgayKhoiChieu(NgayKhoiChieu ngayKhoiChieu) {
		this.ngayKhoiChieu = ngayKhoiChieu;
	}
	
	public double giaKhiGiam(int x) {
		return (this.giaVe * (100 - x)) / 100;
	}
	
	public boolean kiemTra(Film film) {
		if(this.giaVe > film.getGiaVe()) {
			return false;
		}
		else {
			return true;
		}
	}
	public String getTenHangSanXuat() {
		return this.hangSanXuat.getTenHangSanXuat();
	}
}
