
public class Vehicle {
	private String make;
	private String model;
	private int year;
	private double weight;
	public Vehicle(String make, String model, int year, double weight) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.weight = weight;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}
