import java.util.Scanner;

public class TH2_01 {
	public static void main(String[] args) {
		int n, tong = 0;
		float trungBinh;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap vao so phan tu mang: ");
		n = sc.nextInt();
		
		int mang[] = new int[n];
		for (int i = 0; i < n; i ++) {
			System.out.print("Nhap gia tri " + (i+1) + ": ");
			mang[i] = sc.nextInt();
			tong += mang[i];
		}
		trungBinh = tong / n;
		System.out.println("Gia tri trung binh cua mang la: " + trungBinh);
	}
}
