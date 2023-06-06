
public class FullTimeEmployee extends Employee {
	private double baseSalary;

	public FullTimeEmployee(String name, int id, double baseSalary) {
		super(name, id);
		this.baseSalary = baseSalary;
	}

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		this.setLuong(baseSalary * 12);
	}
	
}
