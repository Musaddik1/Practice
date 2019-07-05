package prototype;

public class Employee implements Cloneable {
	
	private String name;
	private int id;
	private double salary;
	public Employee()
	{
		
	}
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	protected Employee clone() throws CloneNotSupportedException {
	
		String name1=this.getName();
		int id1=this.getId();
		double salary=this.getSalary();
		return new Employee(name1, id1, salary);
		
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
	

}
