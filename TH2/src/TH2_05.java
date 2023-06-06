import java.util.Scanner;

public class TH2_05 {
	public static void main(String[] args) {
		String chuoi;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao chuoi can kiem tra: ");
		chuoi = sc.nextLine();
		if(chuoi.matches("^[A-Z][^\\s]{0,18}[0-9]$")) {
			System.out.println("Duyet!");
		}
		else {
			System.out.println("Khong duyet");
		}
	}
}