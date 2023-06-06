
public class Car extends Vehicle {
	private int numdoor;

	public Car(String make, String model, int year, double weight, int numdoor) {
		super(make, model, year, weight);
		this.numdoor = numdoor;
	}

	public int getNumdoor() {
		return numdoor;
	}

	public void setNumdoor(int numdoor) {
		this.numdoor = numdoor;
	}
	
}
