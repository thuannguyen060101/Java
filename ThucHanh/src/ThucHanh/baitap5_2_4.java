package ThucHanh;

import java.util.Scanner;

public class baitap5_2_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao chuoi s: ");
		String s = sc.nextLine();
		
		int count = 0;
		for (int i = 0; i < s.length(); i ++) {
			if(Character.isDigit(s.charAt(i))) {
				count ++;
			}
		}
		
		System.out.println("So luong ky tu so trong chuoi s la: " + count);
	}
}
