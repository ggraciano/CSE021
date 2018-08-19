package io;

import java.util.*;
import java.io.*;

public class People {
	
	public ArrayList<Person> readFile() {
		// this version asks for the file
		System.out.print("Enter the file name: ");
		Scanner kbd = new Scanner(System.in);
		String filename = kbd.next();
		kbd.close();
		return readFile(filename);
	}
	
	
	public ArrayList<Person> readFile(String filename) {
		// create people array
		ArrayList<Person> people = new ArrayList<Person>();
		
		try {
			Scanner input = new Scanner ( new FileReader(filename) );
			while (input.hasNextLine()) {
				
				/*
				 * Fill-in .. Do not touch the rest of the code
				 */ 
				input.useDelimiter("[\t\n]");
				String name = input.next();
				int age = input.nextInt();
				String location = input.next();
				location = location.replace("\n", "").replace("\r", "");
				Person c = new Person(name, age, location);
				people.add(c);
				System.out.println(name + " @" + location + " is " + age);

				// end of code to be filled in
			} 
			input.close();
		} catch ( NoSuchElementException e){
			System.out.println(e); 
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		return people;
	}

	
	public void printPeople(ArrayList<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}
	}
	
	
}
