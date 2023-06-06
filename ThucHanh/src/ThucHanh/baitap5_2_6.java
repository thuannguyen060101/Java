package ThucHanh;


import java.util.Scanner;

public class baitap5_2_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Nhap vao chieu cao cua kim tu thap: ");
		int n = sc.nextInt();
		int k = 0;
		for(k = 1; k <= n; k++) {
            for(int j = 1; j <= n-k; j++) {
            	System.out.print("  ");
            }
            for(int i = 1; i <= 2*k-1; i++) {
            	if(i == 1 || i == 2*k-1 || k == n) {
            		System.out.print("* ");
            	}
            	else {
            		System.out.print("  ");
            	}
            }
            System.out.println("");
        }
	}
}