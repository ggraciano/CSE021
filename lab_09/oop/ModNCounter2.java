package oop;


public class ModNCounter2  extends Counter {
	
	
	private int myN;
	
	public ModNCounter2 (int n) {
		myN = n;
	}
	
	@Override
	public int value ( ) {
		if (super.value() % myN == 0) {
			super.reset();
		}
		
		return super.value();
	}

}
