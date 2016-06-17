import java.util.Arrays;
import java.util.Random;

public class Array_Practice {

	static Random randNum = new Random();
	
	public static void printArray(String message, int array[])
	{
		System.out.printf("\n\n%s: ", message);
		for (int i = 0; i < array.length; i++)
		{
			System.out.printf("%d, ", array[i]);
		}
	}
	
	public static void initArray(int counter, int[] array)
	{
		for (int i = 0; i < counter; i++)
		{
			array[i] = (randNum.nextInt(500) + 1);
		}
	}
	
	public static void main(String[] args) {
		
		int count;
		count = (randNum.nextInt(50) + 1);
		int[] intArray = new int[count];
		
		initArray(count, intArray);
		printArray("Unsorted Array", intArray);
		Arrays.sort(intArray);
		printArray("Sorted Array:", intArray);
	}

}
