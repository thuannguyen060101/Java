import java.util.Scanner;

public class TH2_02 {
	public static void main(String[] args) {
		int n;
		int temp;
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap vao so phan tu mang: ");
		n = sc.nextInt();

		int mang[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu " + (i + 1) + ": ");
			mang[i] = sc.nextInt();
		}
		System.out.print("Mang: ");
		for (int i = 0; i < n; i++) {

			System.out.print(mang[i] + " ");

		}
		for (int i = 0; i < n / 2; i++) {
			temp = mang[i];
			mang[i] = mang[n - i - 1];
			mang[n - i - 1] = temp;
		}
		System.out.print("\r\nMang sau khi sap xep: ");
		for (int i = 0; i < n; i++) {

			System.out.print(mang[i] + " ");

		}
	}
}
