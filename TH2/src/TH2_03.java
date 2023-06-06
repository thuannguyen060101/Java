import java.util.Scanner;

public class TH2_03 {
	public static void main(String[] args) {
		String chuoi;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so dien thoai: ");
		chuoi = sc.nextLine();
		if(chuoi.matches("094-[0-9]{3}-[0-9]{4}")) {
			System.out.println("So dien thoai hop le");
		}
		else {
			System.out.println("So dien thoai khong hop le");
		}
	}
}