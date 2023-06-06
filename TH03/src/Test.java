import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chieu dai hinh chu nhat: ");
		double chieuDai = sc.nextDouble();
		System.out.print("Nhap chieu rong hinh chu nhat: ");
		double chieuRong = sc.nextDouble();
		HinhChuNhat hcn = new HinhChuNhat(chieuDai, chieuRong);
		System.out.println("Dien tich hinh chu nhat la: " + hcn.tinhDienTich());
		System.out.println("Chu vi hinh chu nhat la: " + hcn.tinhChuVi());
	}
	
	
}
