
public class FindDuplicateCount {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 4, 2, 4, 3, 0, 5, 3, 2};
		
		// Fill-in
		int dup = 0;
		
		for (int i = 0; i < arr.length; i++) {
			dup = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					dup++;
				}
			}
			
			if (dup > 1) {
				System.out.println("There are " + dup + " more occurences of value " + arr[i] + " starting at index " + i);
			}
			
			else if (dup == 1) {
				System.out.println("There is only " + dup + " more occurence of value " + arr[i] + " starting at index " + i);
			}
			
			else {
				System.out.println("No duplicates with value " + arr[i] + " beyond index " + i);
			}
		}
		
	}

}
