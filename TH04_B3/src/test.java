
public class test {
	public static void main(String[] args) {
		FullTimeEmployee ft = new FullTimeEmployee("Thuan", 100, 10000);
		PartTimeEmployee pt = new PartTimeEmployee("Vien", 100, 10, 20000);
		
		ft.calculateSalary();
		pt.calculateSalary();
		
		System.out.println("Luong nhan vien full time la: " + ft.getLuong());
		System.out.println("Luong nhan vien part time la: " + pt.getLuong());
	}
	
}
