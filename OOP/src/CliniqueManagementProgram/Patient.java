package CliniqueManagementProgram;

public class Patient {
	
	private String name;
	private int id;
	private long phone;
	private int age;
	private String date;
	public Patient()
	{
		
	}

	public Patient(int id, String name, long phone, int age,String date) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.date=date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", phone=" + phone + ", age=" + age + ", date=" + date + "]";
	}

	
	

}
