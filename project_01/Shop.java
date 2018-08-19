import java.util.ArrayList;
import java.util.Scanner;

public class Shop {

	static Scanner input = new Scanner(System.in);

	public static void setupShop(int numList, ArrayList<String> name, ArrayList<Double> price, ArrayList<Integer> amt, int reqDisc, double rate) {
		for (int i = 0; i < numList; i++) {
			name.add(new String());
			price.add(new Double(0));
			amt.add(new Integer(0));
			
		}
		for (int i = 0; i < numList; i++) {
			System.out.print("Enter name of product " + i + ": ");
			name.set(i, new String(input.next()));
			
			System.out.print("Enter price of product " + i + ": ");
			price.set(i, new Double(input.nextDouble()));
		}
		
	}

	public static int buyItems(int numList, ArrayList<String> name, ArrayList<Integer> amt) {
		int amtAdd = 0;
		
		if (numList > 0) {
			for (int i = 0; i < numList; i++) {
				System.out.print("Enter the amount of " + name.get(i) + ": ");
				amt.set(i, new Integer(input.nextInt()));
				amtAdd++;
			}
		}
		else {
			System.out.println("Shop is not setup yet!");
		}
		
		return amtAdd;
	}

	public static void listItems(int numList, int amtAdd, ArrayList<String> name, ArrayList<Double> price, ArrayList<Integer> amt) {
		if (numList > 0) {
			if (amtAdd > 0) {				
				for (int i = 0; i < numList; i++) {
					if (amt.get(i) > 0) {
						System.out.println(amt.get(i) + " count of " + name.get(i) + " @ " + price.get(i) + " = $" + (amt.get(i) * price.get(i)));
					}
				}				
			}
			else {
				System.out.println("Try again: You have not bought anything");
			}
		}
		else {
			System.out.println("Shop is not setup yet!");
		}
				
		return;
	}

	public static void checkOut(int numList, int amtAdd, double subTotal, int reqDisc, double rate) {
		if(numList > 0) {
			if (amtAdd > 0) {
				double disc = 0;
				System.out.println("Thanks for coming!");
				System.out.println("Sub total: $" + subTotal);
				
				if (subTotal >= reqDisc) {
					disc = subTotal * rate;
					System.out.println("-Discount: $" + disc);
				}
				else {
					System.out.println("-Discount: $" + disc);
				}
				
				System.out.println("Total\t : $" + (subTotal - disc));
			}
			else{
				System.out.println("Try again: You have not bought anything");
			}
		}
		else {
			System.out.println("Shop is not setup yet!");
		}
		
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<Double> price = new ArrayList<Double>();
		ArrayList<Integer> amt = new ArrayList<Integer>();
		
		double rate = 0, subTotal = 0;
		int func = 0, reqDisc = 0, numList = 0, amtAdd = 0;
		
		do {
			System.out.println("This program supports 4 functions: ");
			System.out.println("\t1. Setup Shop\n\t2. Buy\n\t3. List Items\n\t4. Checkout");
			System.out.print("Please choose the function you want: ");
			func = input.nextInt();
			
			if (func <= 0 || func >= 5) {
				System.out.println("\nError: Do not know " + func + "\n");
				continue;
			}
			if (func == 1) {
				System.out.print("Please enter the number of items: ");
				numList = input.nextInt();
				
				System.out.println("");
				
				setupShop(numList, name, price, amt, reqDisc, rate);
				
				System.out.print("Please enter the amount to qualify for discount: ");
				reqDisc = input.nextInt();
				
				System.out.print("Please enter the discount rate (0.1 for 10%): ");
				rate = input.nextDouble();
				
				System.out.println("");
			}
			if (func == 2) {
				System.out.println("");
				
				amtAdd = buyItems(numList, name, amt);
				
				subTotal = 0;
				
				if (numList > 0) {
					if (amtAdd > 0) {				
						for (int i = 0; i < numList; i++) {
							if (amt.get(i) > 0) {
								subTotal += amt.get(i) * price.get(i);
							}
						}				
					}
				}
				
				System.out.println("");
			}
			if (func == 3) {
				System.out.println("");
				
				listItems(numList, amtAdd, name, price, amt);
				
				System.out.println("");
			}
			if (func == 4) {
					System.out.println("");
					
					checkOut(numList, amtAdd, subTotal, reqDisc, rate);
					
					System.out.println("");
					
					if (amtAdd > 0) {
						break;
					}
			}
		} while (func >= 0 || func < 0);
		
		return;
	}

}
