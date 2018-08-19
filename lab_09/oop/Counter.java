package oop;


public class Counter {

	private int myCount = 0;
	//protected int myCount = 0;
	
	public void increment ( ) {
		myCount++;
	}
	
	public int value ( ) {
		return myCount;
	}
	
	public void reset ( ) {
		myCount = 0;
	}
	
/*	public int getValue ( ) {
		return myCount;
	} */
	
/*	public void setValue (int count) {
		myCount = myCount - count;
	} */



}
