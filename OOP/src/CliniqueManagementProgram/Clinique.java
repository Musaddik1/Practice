package CliniqueManagementProgram;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;

import CDP.Utility;

public class Clinique {
	Scanner scanner=new Scanner(System.in);
	Utility uti=new Utility();
	public Doctor addDoctor() 
	{
		Doctor doctor=new Doctor();
		System.out.println("Enter Id :");
		int id=uti.inputInteger();
		doctor.setId(id);
		System.out.println("Enter Name :");
		String name=uti.inputString();
		doctor.setName(name);
		System.out.println("Enter Specialization :");
		String specialization=uti.inputString();
		doctor.setSpecialization(specialization);
		System.out.println("Enter Availability :");
		String available=uti.inputString();
		doctor.setAvailability(available);
		System.out.println("Enter number of patient :");
		int number=uti.inputInteger();
		doctor.setPatients(number);
		return doctor;
		
		
	}
	public Patient addpatient()
	{
		Patient patient=new Patient();
		System.out.println("Enter Id :");
		int id=uti.inputInteger();
		patient.setId(id);
		System.out.println("Enter Name :");
		String name=uti.inputString();
		patient.setName(name);
		System.out.println("Enter Mobile :");
		int mobileno=uti.inputInteger();
		patient.setPhone(mobileno);
		System.out.println("Enter Age :");
		int age=uti.inputInteger();
		patient.setAge(age);
		
		return patient;
	}
	public HashMap<Doctor, Integer> takeAppointment(HashMap<Doctor, Integer> list,Doctor doctor)
	{
		System.out.println("Enter Date :");
		int date=uti.inputInteger();
		list.put(doctor,date);
		return list;
		
	}
	

}
