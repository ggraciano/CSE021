package io;

import java.util.ArrayList;

public class IORunner {
	
	public static ArrayList<Person> people = new ArrayList<Person>();

	
	public static void main(String[] args) {
		// edit as necessary
		//testPeople();		
		testPeople();
		
		testPrintPeople();
		
		testPhoneNums();

		
	}
	

	
	
	public static void testPeople() {
		// fill in as necessary	
		System.out.println("-- testPeople\n");
		People c = new People();
		people.addAll(c.readFile());
	}
	
	public static void testPrintPeople() {
		System.out.println("\n-- testPrintPeople\n");
		People c = new People();
		c.printPeople(people);
	}
	
	public static void testPhoneNums() {
		System.out.println("\n-- testPhoneNums\n");
		PhoneNums c = new PhoneNums();
		c.readPhoneNumbers();
	}
	
	

	
	
}
