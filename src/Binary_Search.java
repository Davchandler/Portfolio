import java.util.Scanner;

public class Binary_Search {

	public static void arrayLoad(int[] array){
		
		for (int i = 0; i < array.length; i++){
			array[i] = ((int)(Math.random() * 128));
			System.out.printf("%d  ", array[i]);
		}
	}
	
	public static void sortArray(int[] array){
		 
		int temp = 0;
		for (int i = 0; i < array.length; i++){
			for (int j = 1; j < array.length - i; j++){
				if (array[j - 1] > array[j]){
					temp = array[j -1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
	public static boolean searchArray(int num, int[] array){
		
		boolean found = false;
		int low = 0;
		int high = array.length - 1;
		int marker = (((low + high)/2) +1);
		
		while (low < high){
			if (array[marker] == num){
				low = high +10;
				return !found;
			} else {
				if (num < array[marker]){
					high = marker;
					marker = (((low + high)/2) +1);
				} else {
					if (num > array[marker]){
						low = marker;
						marker = (((low + high)/2) +1);
					}
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		int choice;
		int[] intArray = new int[25];
		Scanner input = new Scanner(System.in);
		
		arrayLoad(intArray);
		sortArray(intArray);
		
		System.out.println();
		
		for (int i = 0; i < intArray.length; i++){
			System.out.printf("%d  ", intArray[i]);
		}
		
		System.out.println();
		System.out.println("Number to locate?");
		choice = input.nextInt();
		
		searchArray(choice, intArray);
	}

}
