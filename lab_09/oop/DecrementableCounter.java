package oop;


public class DecrementableCounter  extends Counter{
	
//	private int count = 0;
	
	public void decrement ( ) {
		if (super.value() == 0) {
		//	count = 0;
			return;
		}
		else {
			int original = super.value();
			super.reset();
			for(int i = 1; i < original; i++) {
				increment();
			}
		}
	}
	
/*	@Override
	public int value ( ) {
		if(count == 0) {
			return super.value();
		}
		else {
			return count;
		}
	} */

}
