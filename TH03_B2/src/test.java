
public class test {
	public static void main(String[] args) {
		HangSanXuat hsx1 = new HangSanXuat("Tokyo", "Nhat");
		HangSanXuat hsx2 = new HangSanXuat("BoBanBo", "VietNam");
		HangSanXuat hsx3 = new HangSanXuat("America", "My");
		NgayKhoiChieu nkc1 = new NgayKhoiChieu(20, 1, 2000);
		NgayKhoiChieu nkc2 = new NgayKhoiChieu(30, 6, 2005);
		NgayKhoiChieu nkc3 = new NgayKhoiChieu(10, 2, 2002);
		Film film1 = new Film("Doraemon", 1999, 10000, hsx1, nkc1);
		Film film2 = new Film("CoBeVang", 2005, 15000, hsx2, nkc2);
		Film film3 = new Film("Medisu", 2001, 30000, hsx3, nkc3);
		
		if(film1.kiemTra(film2) ) {
			System.out.println("Gia ve " + film1.getTenFilm() + " re hon gia ve "+ film2.getTenFilm());
		}
		else {
			System.out.println("Gia ve " + film1.getTenFilm() + " mac hon gia ve "+ film2.getTenFilm());
		}
		
		System.out.println("Ten hang san xuat phim "+ film3.getTenFilm()+ " la: " + film3.getTenHangSanXuat());
		System.out.println("Gia ve " + film1.getTenFilm() +" sau khi giam " + 10 + "% la: "+ film1.giaKhiGiam(10));
	}
}
