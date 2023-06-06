
public class test {
	public static void main(String[] args) {
		Motorcycle m = new Motorcycle("Yamaha", "Den", 2000, 50, 2);
		Car c = new Car("Okie", "TrangDen", 2006, 100, 4);
		
		System.out.println("So canh cua cua xe oto hang san xuat " + c.getMake() + " la: " + c.getNumdoor());
		System.out.println("So banh xe cua xe oto hang san xuat " + m.getMake() + " la: " + m.getNumWheels());
		
	}
	
}
