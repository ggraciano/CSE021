import java.util.*;
import java.io.*;

public class Match {
	
	protected static int count = 0;
	protected static Student[] s = new Student[99];
	protected static Date[] d = new Date[99];
	protected static Preference[] p = new Preference[99];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Student[] s = new Student[99];
		Date[] d = new Date[99];
		Preference[] p = new Preference[99];
	*/	String filename = "data/FullRoster.txt";
		int i = 0;
	//	int count = 0;
		try {
			Scanner input = new Scanner(new FileReader(filename));
			input.useDelimiter("[-\t\n]");
			while (input.hasNextLine()) {
			//	input.useDelimiter("[-\t\n]");
				String name = input.next();
				String genTemp = input.next();
				char gender = genTemp.charAt(0);
				int month = input.nextInt();
				int day = input.nextInt();
				int year = input.nextInt();
				int quietTime = input.nextInt();
				int music = input.nextInt();
				int reading = input.nextInt();
				String chatTemp = input.next();
				chatTemp = chatTemp.replace("\n", "").replace("\r", "");
				int chatting = Integer.parseInt(chatTemp);
			//	s[i].setName(name);
			//	s[i].setGender(gender);
				d[i] = new Date();
				d[i].setMonth(month);
				d[i].setDay(day);
				d[i].setYear(year);
			//	s[i].setBirthDay(d[i]);
				p[i] = new Preference();
				p[i].setQuietTime(quietTime);
				p[i].setMusic(music);
				p[i].setReading(reading);
				p[i].setChatting(chatting);
			//	s[i].setPref(p[i]);
				s[i] = new Student(name, gender, d[i], p[i]);
				
				System.out.println(name + " " + gender + " " + month + " " + day + " " + year + " " + quietTime + " " + music + " " + reading + " " + chatting);
				
				i++;
				count++;
			}
			input.close();
		} catch ( NoSuchElementException e){
			System.out.println(e);
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		System.out.println("Number of students: " + count);
		
		compare();
	//	System.out.println(s[1].compare(s[4]));
	}
	
	public static void compare() {
		for (int i = 0; i < count; i++) {
			if (s[i].getMatched() == false) {
				int max = 0;
				int value = 0;
				int[] score = new int[count];
				for (int j = 0; j < count; j++) {
				//	int[] score = new int[count - 1];
					if (s[i].equals(s[j]) || s[j].getMatched() == true) {
						continue;
					}
					else {
						score[j] = s[i].compare(s[j]);
					}
				}
				for (int j = 0; j < count; j++) {
					if (score[j] > max) {
						max = score[j];
						value = j;
					}
				}
				s[i].setMatched(true);
				s[value].setMatched(true);
				if (value > 0) {
					System.out.println(s[i].getName() + " matches with " + s[value].getName() + " with score " + max);
				}
				else {
					System.out.println(s[i].getName() + " has no matches.");
				}
			}
		}
	}

}
