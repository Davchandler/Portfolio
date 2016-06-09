import java.util.Scanner;


public class Linear_Search {

	public static void arrayLoad(int[] array){
		
		for (int i = 0; i < array.length; i++){
			array[i] = ((int)(Math.random() * 128));
			System.out.printf("%d  ", array[i]);
		}
	}
	
	public static String searchArray(int num, int[] array){
		
		boolean found = false;
		
		for (int i = 0; i < array.length; i++){
			if (array[i] == num){
				found = true;
			}
		}
		
		if (found == true){
			return "Found it!";
		}else
			return "Not here!";
	}
	
	public static void main(String[] args) {
		
		int selection;
		Scanner input = new Scanner(System.in);
		int[] numArray = new int[25];
		
		arrayLoad(numArray);
		
		System.out.println();
		System.out.println("Choose number to locate: ");
		selection = input.nextInt();
		
		System.out.println(searchArray(selection, numArray));
		
	}

}
