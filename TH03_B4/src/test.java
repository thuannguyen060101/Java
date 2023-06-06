
public class test {
	public static void main(String[] args) {
		QuocGia qg1 = new QuocGia("001", "VietNam");
		QuocGia qg2 = new QuocGia("002", "NhatBan");
		NgaySanXuat ngaySanXuat1 = new NgaySanXuat(30, 5, 2020);
		NgaySanXuat ngaySanXuat2 = new NgaySanXuat(10, 5, 2023);
		HangSanXuat hangSanXuat1 = new HangSanXuat("VietNamChatLuongCao", qg1);
		HangSanXuat hangSanXuat2 = new HangSanXuat("Toyota", qg2);
		MayTinh mayTinh1 = new MayTinh(hangSanXuat2, ngaySanXuat1, 3000000, 6);
		MayTinh mayTinh2 = new MayTinh(hangSanXuat2, ngaySanXuat2, 2500000, 6);
		
		if(mayTinh1.kiemTra(mayTinh2)) {
			System.out.println("May tinh 1 mac hon may tinh 2");
		}
		else {
			System.out.println("May tinh 1 re hon may tinh 2");
		}
		
		System.out.println("Quoc gia san xuat may tinh 1 la: " + mayTinh1.tenQuocGia());
	}
}
