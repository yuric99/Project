package entities;

public class Employee {

	private String name;
	private Integer id;
	private Double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}

	public void increaseSalary(double percentage) {
		salary += (salary * percentage / 100.0);
	}

	public String toString() {

		return id 
				+ ", " 
				+ name 
				+ ", " 
				+ String.format("%.2f", salary);
	}

}
