import java.util.Scanner;

public class TH2_04 {
	public static void main(String[] args) {
		boolean flag = true;
		String mang[] = new String[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0 ; i < 5; i++) {
			System.out.print("Nhap ma so sinh vien thu " + (i + 1) + ": ");
			mang[i] = sc.nextLine();
		}
		
		for (int i = 0 ; i < 5; i ++) {
			if(mang[i].matches("B170[1-9]{4}") == false) {
				System.out.print("\nMSSV thu " + (i + 1) + " sai dinh dang");
				flag = false;
			}
		}
		
		if(flag == true) {
			System.out.print("\n\rTat ca MSSV dung");
			
		}
	}
}