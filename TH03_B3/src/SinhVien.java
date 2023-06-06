
public class SinhVien {
	private String maSV;
	private String hoTenSV;
	private NgaySinh ngaySinh;
	private double diemTB;
	private Lop lop;
	public SinhVien(String maSV, String hoTenSV, NgaySinh ngaySinh, double diemTB, Lop lop) {
		this.maSV = maSV;
		this.hoTenSV = hoTenSV;
		this.ngaySinh = ngaySinh;
		this.diemTB = diemTB;
		this.lop = lop;
	}
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getHoTenSV() {
		return hoTenSV;
	}
	public void setHoTenSV(String hoTenSV) {
		this.hoTenSV = hoTenSV;
	}
	public NgaySinh getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(NgaySinh ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public double getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}
	public Lop getLop() {
		return lop;
	}
	public void setLop(Lop lop) {
		this.lop = lop;
	}
	
	public String getTenKhoa() {
		return this.lop.getTenKhoa();
	}
	public boolean kiemTraTotNghiep() {
		if(this.diemTB >= 5.0) {
			return true;
		}
		return false;
	}
	public boolean kiemTraNgaySinh(SinhVien sv) {
		if(this.ngaySinh.equals(sv.ngaySinh) ) {
			return true;
		}
		return false;
	}
}
