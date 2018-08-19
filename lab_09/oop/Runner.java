package oop;

public class Runner {

	public static void main(String[] args) {
		testCounter();

		testCounter7Statements();

		// testModNCounter();
		testModNCounter();
		
		testModNCounter2();
		
		testDecrementableCounter();
		
		testSeasonCounter();
	}

	
	public static void testCounter() {
		System.out.println("-- testing Counter");

		Counter c = new Counter();
		c.increment();
		c.increment();
		c.increment();
		System.out.println(c.value());

	}

	
	// Use this method to complete exercise 1c
	public static void testCounter7Statements() {
		Counter c = new Counter();
		System.out.println("-- testing 7 statements");
		// include exactly 7 increment() and reset() statements below
		c.increment();
		c.increment();
		c.increment();
		c.reset();
		c.increment();
		c.increment();
		c.increment();

		System.out.println("current value: " + c.value());
	}

	
	public static void testModNCounter() {
		System.out.println("-- testing ModNCounter");
		ModNCounter c = new ModNCounter(2);
		System.out.println(c.value());
		c.increment();
		System.out.println(c.value());
		c.increment();
		System.out.println(c.value());
		c.increment();
	}

	
	public static void testModNCounter2() {
		System.out.println("-- testing ModNCounter2");
		ModNCounter2 c = new ModNCounter2(2);
		System.out.println(c.value());
		c.increment();
		System.out.println(c.value());;
		c.increment();
		System.out.println(c.value());
		c.increment();
	}

	
	public static void testDecrementableCounter() {
		System.out.println("-- testing DeccrementableCounter");
		DecrementableCounter c = new DecrementableCounter();
		System.out.println(c.value()); //0
		c.increment();
		System.out.println(c.value()); //1
		c.increment();
		System.out.println(c.value()); //2
		c.decrement();
		System.out.println(c.value()); //1
		c.increment();
		System.out.println(c.value());
		c.decrement();
		System.out.println(c.value()); //0
		c.decrement();
		System.out.println(c.value()); //0
		c.increment();
	}
	
	public static void testSeasonCounter() {
		System.out.println("-- testting SeasonCounter");
		SeasonCounter c = new SeasonCounter(4);
		System.out.println(c.toString());
		c.increment();
		System.out.println(c.toString());
		c.increment();
		System.out.println(c.toString());
		c.increment();
		System.out.println(c.toString());
		c.increment();
		System.out.println(c.toString());
		c.increment();
	}

}
