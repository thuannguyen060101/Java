package ThucHanh;

import java.util.Scanner;

public class baitap5_2_3 {
	public static void main(String[] args) {
		int tong = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if ( n % 2 == 0) {
			for ( int i = 0 ; i <= n ; i ++) {
				if(i % 2 == 0) {
					tong += i;
				}
			}
		}
		else {
			for ( int i = 0 ; i <= n ; i ++) {
				if(i % 2 != 0) {
					tong += i;
				}
			}
		}
		
		System.out.println("Tong la: " + tong);
	}
}
