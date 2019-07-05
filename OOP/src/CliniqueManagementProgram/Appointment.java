package CliniqueManagementProgram;

public class Appointment {

	private String doctorName;
	private String patientName;
	private int date;
	
	public Appointment()
	{
		
	}

	public Appointment(String doctorName, String patientName, int date) {
		super();
		this.doctorName = doctorName;
		this.patientName = patientName;
		this.date = date;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Appointment [doctorName=" + doctorName + ", patientName=" + patientName + ", date=" + date + "]";
	}
	
}
