package oop;

public class SeasonCounter extends ModNCounter {

	
	private static String[] names =  {"spring", "summer", "fall", "winter"};
	
	
	public SeasonCounter(int a) {
        // fill-in by creating an object with 4 divisor
		super(a);
    }
	

	@Override
	public String toString() {
        // fill-in so it returns the season name
		String season = "";
		if (super.value() == 0) {
			season = names[0];
		}
		if (super.value() == 1) {
			season = names[1];
		}
		if (super.value() == 2) {
			season = names[2];
		}
		if (super.value() == 3) {
			season = names[3];
		}
		
		return season;
	}
	
  	
}
