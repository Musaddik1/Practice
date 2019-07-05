package CliniqueManagementProgram;

public class Doctor {

	
	private String name; 
	private int id;
	private String specialization;
	private String availability;
	private int patients;
	private String date;
	
	public Doctor()
	{
		
	}

	public Doctor(int id, String name, String specialization, String availability, int patients,String date) {
		super();
		this.id = id;
		this.name = name;
		this.specialization = specialization;
		this.availability = availability;
		this.patients = patients;
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

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public int getPatients() {
		return patients;
	}

	public void setPatients(int patients) {
		this.patients = patients;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Doctor [name=" + name + ", id=" + id + ", specialization=" + specialization + ", availability="
				+ availability + ", patients=" + patients + ", date=" + date + "]";
	}

	
	
}
