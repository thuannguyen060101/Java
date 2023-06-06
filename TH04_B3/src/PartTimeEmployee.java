
public class PartTimeEmployee extends Employee {
	private double hoursWorked;
	private double hourlyRate;
	public PartTimeEmployee(String name, int id, double hoursWorked, double hourlyRate) {
		super(name, id);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		this.setLuong(hoursWorked * hourlyRate);
	}
}
