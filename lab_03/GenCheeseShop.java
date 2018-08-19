import java.util.Random;
import java.util.Scanner;

public class GenCheeseShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ranGen = new Random(100);
		Scanner input = new Scanner(System.in);
		
		final int numC = 10;
		int i, choice;
		double total = 0, discount = 0;
		
		System.out.println("We sell " + numC + " kinds of Cheese");
		
		String[] names = new String[numC];
		double[] prices = new double[numC];
		int[] amounts = new int[numC];
		
		if (numC > 0) {
			names[0] = "Dalaran Sharp";
			prices[0] = 1.25;
		}
		
		if (numC > 1) {
			names[1] = "Stormwind Brie";
			prices[1] = 10.0;
		}
		
		if (numC > 2) {
			names[2] = "Alterac Swiss";
			prices[2] = 40.0;
		}
		
		if (numC > 3) {
			for (i = 3; i < numC; i++) {
				names[i] = "Cheese Type " + (char)('A' + i);
				prices[i] = ranGen.nextInt(1000)/100.0;
			}
		}
		
		for (i = 0; i < numC; i++) {
			System.out.println(names[i] + ": $" + prices[i] + " per pound");
		}
		
		for (i = 0; i < numC; i++) {
			System.out.print("Enter the amount of " + names[i] + " : ");
			amounts[i] = input.nextInt();
		}
		
		if (numC > 0) {
			System.out.print("Display the itemized list? (1 for yes) ");
			choice = input.nextInt();
			
			if (choice == 1) {
				for (i = 0; i < numC; i++) {
					System.out.println(amounts[i] + " lbs of " + names[i] + " @ " + prices[i] + " = $" + (amounts[i] * prices[i]));
				}
			}
			
			for (i = 0; i < numC; i++) {
				total += (amounts[i] * prices[i]);
			}
			
			if (total > 50) {
				discount = 10.0;
			}
			
			if (total > 100) {
				discount += 15.0;
			}
		}
		
		System.out.println("\nSub Total: $" + total);
		System.out.println("-Discount: $" + discount);
		System.out.println("Total\t : $" + (total - discount));
		
		input.close();
	}

}
