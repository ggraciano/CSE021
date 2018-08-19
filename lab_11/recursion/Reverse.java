package recursion;

public class Reverse {

	/*
	 * Now, write a recursive solution to reverse without using any helper methods.
	 * That is, reverse should only call reverse! (and some string manipulation methods).
	 */
	
	
	public String reverse (String s) {

		if (s.length() == 1) {
			// base case
			return s.substring(0,1);
			
			
		} else {
			// the recursive case! 
			//for (int i = 0; i < s.length(); i++) {
				String c = s.substring(s.length() - 1, s.length()) + reverse(s.substring(0, s.length() - 1));
			//	reverse(s.substring(0, s.length()));
			//}
			return c;
			
			
		}
	}
	
	
	//////// HELPER METHODS YOU MIGHT FIND USEFUL
	
	// returns a string containing all the characters except the first
	public static String allButFirst(String s) {
		return s.substring(1);
	}
	
	// returns a string  containing all the characters except the last
	public static String allButLast(String s) {
		return s.substring(0, s.length());
	}	
	
	// test
	public static void main (String args[]) {
		Reverse c = new Reverse();
		System.out.println(c.reverse("Gerardo"));
	}
}
