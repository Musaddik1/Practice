package com.DataStructure;

import java.util.Scanner;

public class CalendarQueue {
	
	public static void main(String[] args) {
		Utility uti=new Utility();
	
		System.out.println("Enter month :");
		int month=uti.inputInteger();
		System.out.println("Enter year :");
		int year=uti.inputInteger();
		UtilCalendarQueue calendar=new UtilCalendarQueue();
		calendar.calendarQueue(month, year);
		
	}

}
