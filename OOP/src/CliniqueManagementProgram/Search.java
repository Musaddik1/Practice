package CliniqueManagementProgram;

import java.util.ArrayList;
import java.util.Iterator;

public class Search {
	
	public ArrayList<Doctor> searchDoctorById(ArrayList<Doctor> doctorlist,int id)
	{
		for(int i=0;i<doctorlist.size();i++)
		{
			int id1=doctorlist.get(i).getId();
			if(id1==id)
			{
				return doctorlist;
			}
			
		}
		

		return doctorlist;
	}
	public ArrayList<Doctor> searchDoctorByName(ArrayList<Doctor> doctorlist,String name)
	{
		for(int i=0;i<doctorlist.size();i++)
		{
			if(doctorlist.get(i).getName().compareTo(name)==0)
			{
				return doctorlist;
			}
		}
		return doctorlist;
	}
	public ArrayList<Doctor> searchDoctorBySpecialization(ArrayList<Doctor> doctorlist,String specialization)
	{
		for(int i=0;i<doctorlist.size();i++)
		{
			if(doctorlist.get(i).getSpecialization().compareTo(specialization)==0)
			{
				return doctorlist;
			}
		}
			return doctorlist;
	}
	public ArrayList<Doctor> searchDoctorByAvailability(ArrayList<Doctor> doctorlist,String Availability)
	{
		for(int i=0;i<doctorlist.size();i++)
		{
			if(doctorlist.get(i).getAvailability().compareTo(Availability)==0)
			{
				return doctorlist;
			}
		}
		return doctorlist;
	}
	public ArrayList<Patient> searchPatientById(ArrayList<Patient> patientlist,int id)
	{
		for(int i=0;i<patientlist.size();i++)
		{
			if(patientlist.get(i).getId()==id)
			{
				return patientlist;
			}
		}
		return patientlist;
	}
	public ArrayList<Patient> searchPatientName(ArrayList<Patient> patientlist,String name)
	{
		for(int i=0;i<patientlist.size();i++)
		{
			if(patientlist.get(i).getName().compareTo(name)==0)
			{
				return patientlist;
			}
		}
		return patientlist;
	}
	public ArrayList<Patient> searchPatientByMobile(ArrayList<Patient> patientlist,long mobile )
	{
		for(int i=0;i<patientlist.size();i++)
		{
			if(patientlist.get(i).getPhone()==mobile)
			{
				return patientlist;
			}
		}
		return patientlist;
	}
	public ArrayList<Patient> searchPatientByAge(ArrayList<Patient> patientlist,int age)
	{
		for(int i=0;i<patientlist.size();i++)
		{
			if(patientlist.get(i).getAge()==age)
			{
				return patientlist;
			}
		}
		return patientlist;
	}
	public void printDoctor(Clinique clinique)
	{
		
	}

}
