package ThucHanh;

public class baitap5_2_1 {
	public static void main(String[] args) {
		int tong = 0;
		for (int i = 0; i <= 18; i ++) {
			if(i % 2 == 0) {
				tong += i;
			}
		}
		System.out.println("Tong 10 so chan dau tien: " + tong);
	}
}
