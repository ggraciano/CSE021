import java.util.*;

public class RunShop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int max = 0;
		System.out.print("Enter the number of Cheese :");
		max = input.nextInt();
		ShopArr shop = new ShopArr(max);
		//System.out.println("We sell " + max + " types of Cheese");
		shop.run();
		System.out.println("Ran with Cheese Total: " + Cheese.numCheese);
		
		input.close();
	}

}
