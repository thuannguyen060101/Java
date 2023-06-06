
public class test {
	public static void main(String[] args) {
		Lop lop1 = new Lop("VienThong","VienThong");
		Lop lop2 = new Lop("DienTu","DienTu");
		NgaySinh ngaySinh1 = new NgaySinh(30, 03, 2001);
		NgaySinh ngaySinh2 = new NgaySinh(06, 01, 2001);
		SinhVien sv1 = new SinhVien("065", "DacThuan",ngaySinh2,6.5,lop1);
		SinhVien sv2 = new SinhVien("073", "VanVien",ngaySinh2,4.0,lop2);
		System.out.println("Ten khoa sinh vien " + sv1.getHoTenSV() + " dang theo hoc la: " + sv1.getTenKhoa());
		System.out.println("Sinh vien " + sv2.getHoTenSV() +" dieu kien tot nghiep: " + sv2.kiemTraTotNghiep());
		System.out.println("Sinh vien "+ sv2.getHoTenSV() + " so sanh ngay sinh voi " + sv1.getHoTenSV() +": " + sv2.kiemTraNgaySinh(sv1));
	}
}
