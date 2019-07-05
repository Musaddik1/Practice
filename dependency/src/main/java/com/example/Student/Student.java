package com.example.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

	private String name;
	private Address address;
	//private ArrayList<String> mobile;
	private long array[];
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setArray(long[] array) {
		this.array = array;
	}

	/*
	 * public ArrayList<String> getMobile() { return mobile; } public void
	 * setMobile(ArrayList<String> mobile) { this.mobile = mobile; }
	 */
	/*
	 * @Override public String toString() { return "Student [name=" + name +
	 * ", address=" + address + ", mobile=" + mobile + "]"; }
	 */
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", array=" + Arrays.toString(array) + "]";
	}
	
	
	
}
