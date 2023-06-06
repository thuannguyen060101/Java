
public abstract class Employee {
	private String name;
	private int id;
	private double luong;
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public double getLuong() {
		return luong;
	}



	public void setLuong(double luong) {
		this.luong = luong;
	}



	abstract void calculateSalary();
}
