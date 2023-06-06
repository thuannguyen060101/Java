package ThucHanh;

import java.util.Scanner;

public class baitap5_2_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao chieu cao cua kim tu thap: ");
		int n = sc.nextInt();
		int k = 0;
		for (int i = 1; i <= n; ++i, k = 0) {
		      for (int j = 1; j <= n - i; j++) {
		        System.out.print("  ");
		      }
		      while (k != 2 * i - 1) {
		        System.out.print("* ");
		        ++k;
		      }
		      System.out.println();
		 }
	}	
}