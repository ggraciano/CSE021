import java.util.Scanner;

public class RemainderFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int max = 0;
		int divisor = 0;
		
		System.out.print("Please enter the max number: ");
		max = input.nextInt();
		
		System.out.print("Please enter the divisor: ");
		divisor = input.nextInt();
		
		for (int i = 1; i <= max; i++) {
			System.out.println("Num: " + i + " % "+ divisor + " = " + (i % divisor));
		}
		
		input.close();
	}

}
