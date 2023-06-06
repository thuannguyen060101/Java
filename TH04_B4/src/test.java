import java.util.Scanner;

public class test  {
	public static void main(String[] args) {
		Scanner b = new Scanner(System.in);
		System.out.println("Nhap vao R: ");
		double r = b.nextDouble();
		HinhCau sc = new HinhCau(r);
		System.out.println("Chu vi: "+sc.tinhChuVi());
		System.out.println("Dien tich: "+sc.tinhDienTich());
		System.out.println("The tich: "+sc.tinhTheTich());
		}
	}

