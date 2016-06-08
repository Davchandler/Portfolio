// Bubble Sort code written to take a random sampling of integers and place them in order.
//  Once ordered, the sample is displayed to the user.


public class BubbleSort {

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
	
	public static void main(String[] args) {
		
		int[] intArray = new int[25];
		
		arrayLoad(intArray);
		sortArray(intArray);
		
		System.out.println();
		
		for (int i = 0; i < intArray.length; i++){
			System.out.printf("%d  ", intArray[i]);
		}
		
		System.out.println();
		
		
	}

}
