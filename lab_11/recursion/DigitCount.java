package recursion;

public class DigitCount {

	public static void main(String[] args) {
		// test
		System.out.println(digitCount(0));
	}
	
	// Fix the bug in digitCount, so that it returns correct values.
	// You should only need to change one line!
	public static int digitCount (int value) {
		//if (value == 0) {
		if (value < 10) {
			return 1;
		} else {
			return 1 + digitCount(value/10);
		} 
	}
}
