
public class test {
	public static void main(String[] args) {
		Manager mg = new Manager("Thuan", 23, 200000, "IOT");
		System.out.println("Ten nhan vien la: " + mg.getName());
		System.out.println("Tuoi nhan vien la: " + mg.getAge());
		System.out.println("Luong nhan vien la: " + mg.getSalary());
		System.out.println("Nhan vien thuoc bo phan quan ly: " + mg.getDepartment());
	}
	
}
