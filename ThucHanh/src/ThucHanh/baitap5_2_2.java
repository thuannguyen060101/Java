package ThucHanh;

public class baitap5_2_2 {
	public static void main(String[] args) {
		int num = 0;
		int tong = 0;
		int i = 0;
		while ( num != 10) {
			if(i % 2 == 0) {
				tong += i;
				num ++;
			}
			i ++;
		}
		System.out.println("Tong 10 so chan dau tien: " + tong);
	}
}
