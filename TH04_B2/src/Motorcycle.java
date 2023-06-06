
public class Motorcycle extends Vehicle {
	private int numWheels;

	public Motorcycle(String make, String model, int year, double weight, int numWheels) {
		super(make, model, year, weight);
		this.numWheels = numWheels;
	}

	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
	
}
