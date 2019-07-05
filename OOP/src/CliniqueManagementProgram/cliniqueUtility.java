package CliniqueManagementProgram;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;

import CDP.Utility;

public class cliniqueUtility {

	public static void main(String[] args) throws JsonProcessingException, IOException {
		Doctor doctor1[] = null;
		Patient patient1[] = null;
		Utility uti = new Utility();
		Scanner scanner = new Scanner(System.in);
		String pathname = "/home/admin123/eclipse-workspace" + "/OOP/src" + "/CliniqueManagementProgram/doctor.json";
		String pathname1 = "/home/admin123/eclipse-workspace/" + "OOP/src/CliniqueManagementProgram/Patient.json";
		String pathname2 = "/home/admin123/eclipse-workspace/OOP/src/CliniqueManagementProgram/Appointment.json";
		File file = new File(pathname);
		File file1 = new File(pathname1);
		ObjectMapper mapper = new ObjectMapper();
		JsonNode node = null;
		JsonNode node1 = null;
		Doctor doctor = new Doctor();
		Patient patient = new Patient();
		Clinique clinique = new Clinique();
		HashMap<Doctor, Integer> appoint = new HashMap<Doctor, Integer>();
		ArrayList<Clinique> cliniquelist = new ArrayList<Clinique>();
		ArrayList<Doctor> doctorlist = new ArrayList<Doctor>();
		ArrayList<Patient> patientlist = new ArrayList<Patient>();
		node = mapper.readTree(file);
		String string[] = { "first", "second", "third" };
		for (int i = 0; i < string.length; i++) {
			node1 = node.get(string[i]);
			doctor1 = mapper.readValue(node1, Doctor[].class);

			for (Doctor doctor2 : doctor1) {
				doctorlist.add(doctor2);
			}
		}
		node = mapper.readTree(file1);
		for (int i = 0; i < string.length; i++) {
			node1 = node.get(string[i]);
			patient1 = mapper.readValue(node1, Patient[].class);

			for (Patient patient2 : patient1) {
				patientlist.add(patient2);
			}
		}
		Iterator<Doctor> iterator = doctorlist.iterator();
		/*
		 * while (iterator.hasNext()) { System.out.println(iterator.next()); }
		 */
		Search search = new Search();
		char ch;
		do {

			System.out.println("**********clinic**************");
			System.out.println("1.AddDoctor");
			System.out.println("2.AddPatient");
			System.out.println("3.Print Doctor");
			System.out.println("4.Print Patient");
			System.out.println("5.Take Appointment");
			System.out.println("6.Print Appointment");
			System.out.println("7.Search Doctor");
			System.out.println("8.Search Patient");
			System.out.println("Enter your choice :");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				doctor = clinique.addDoctor();
				cliniquelist.add(clinique);
				doctorlist.add(doctor);
				node = mapper.readTree(file);
				mapper.writeValue(file, doctorlist);
				break;
			case 2:
				patient = clinique.addpatient();
				cliniquelist.add(clinique);
				patientlist.add(patient);
				node = mapper.readTree(file1);
				mapper.writeValue(file1, patientlist);
				break;
			case 3:
				System.out.println(" Doctor Details :");
				System.out.println(doctor);
				break;
			case 4:
				System.out.println("Patient Details :");
				System.out.println(patient);
				break;
			case 5:
				appoint = clinique.takeAppointment(appoint, doctor);
				break;
			case 6:
				System.out.println(appoint.toString());
				break;
			case 7:
				System.out.println("1.Search Doctor By Id:");
				System.out.println("2.Search Doctor By Name:");
				System.out.println("3.Search Doctor By Specailization:");
				System.out.println("4.Search Doctor By Availability :");
				int choice1 = uti.inputInteger();
				switch (choice1) {
				case 1:
					System.out.println("Enter Id :");
					int id = uti.inputInteger();
					doctorlist = search.searchDoctorById(doctorlist, id);
					iterator = doctorlist.iterator();
					for (int i = 0; i < doctorlist.size(); i++) {
						int id1 = doctorlist.get(i).getId();
						if (id1 == id) {
							System.out.println(doctorlist.get(i).toString());
						}
					}
					break;
				case 2:
					System.out.println("Enter Name :");
					String name = uti.inputString();
					doctorlist = search.searchDoctorByName(doctorlist, name);
					iterator = doctorlist.iterator();
					for (int i = 0; i < doctorlist.size(); i++) {
						String name1 = doctorlist.get(i).getName();
						if (name1.compareTo(name) == 0) {
							System.out.println(doctorlist.get(i).toString());
						}
					}
					break;
				case 3:
					System.out.println("Enter Specialization :");
					String special = scanner.next();
					doctorlist = search.searchDoctorBySpecialization(doctorlist, special);
					for (int i = 0; i < doctorlist.size(); i++) {
						String special1 = doctorlist.get(i).getSpecialization();
						if (special1.compareTo(special) == 0) {
							System.out.println(doctorlist.get(i).toString());
						}
					}
					break;
				case 4:
					System.out.println("Enter Availability :");
					String avail = uti.inputString();
					doctorlist = search.searchDoctorByAvailability(doctorlist, avail);
					for (int i = 0; i < doctorlist.size(); i++) {
						if (doctorlist.get(i).getAvailability().compareTo(avail) == 0) {
							System.out.println(doctorlist.get(i).toString());
						}
					}
					break;
				default:
					System.out.println("Invalid choice :");

				}
				break;
			case 8:
				System.out.println("1.Search patient by id :");
				System.out.println("2.Search patient by name :");
				System.out.println("3.Search patient by mobile :");
				System.out.println("4.Search patient by age :");
				System.out.println("Enter your choice  :");
				int choice2 = uti.inputInteger();
				switch (choice2) {
				case 1:
					System.out.println("Enter patient id  :");
					int id = uti.inputInteger();
					patientlist = search.searchPatientById(patientlist, id);
					for (int i = 0; i < patientlist.size(); i++) {
						if (patientlist.get(i).getId() == id) {
							System.out.println(patientlist.get(i).toString());
						}
					}
					break;
				case 2:
					System.out.println("Enter patient name :");
					String name = uti.inputString();
					patientlist = search.searchPatientName(patientlist, name);
					for (int i = 0; i < patientlist.size(); i++) {
						if (patientlist.get(i).getName().compareTo(name) == 0) {
							System.out.println(patientlist.get(i).toString());
						}
					}
					break;
				case 3:
					System.out.println("Enter patient mobile number :");
					long mobile = uti.inputInteger();
					patientlist = search.searchPatientByMobile(patientlist, mobile);
					for (int i = 0; i < patientlist.size(); i++) {
						if (patientlist.get(i).getPhone() == mobile)

						{
							System.out.println(patientlist.get(i).toString());
						}
					}
					break;
				case 4:
					System.out.println("Enter patient Age :");
					int age = uti.inputInteger();
					patientlist = search.searchPatientByAge(patientlist, age);
					for (int i = 0; i < patientlist.size(); i++) {
						if (patientlist.get(i).getAge() == age) {
							System.out.println(patientlist.get(i).toString());
						}
					}
					break;
				}
				break;
			default:
				System.out.println("Invalid choice :");
			}
			System.out.println("Do you want to continue :[y/n]");
			ch = scanner.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');

	}

}
