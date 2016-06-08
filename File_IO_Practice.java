
import java.io.*;
import java.util.Scanner;


public class File_IO_Practice {

	public static void main(String[] args) {
		
		File ftest = new File("test.txt");
		
		//Writing name and age to the file.
		try {
		PrintWriter output = new PrintWriter(ftest);
		
		output.println("David Chandler");
		output.println(44);
		output.close();
		} catch (IOException ex) {
			System.out.printf("ERROR: %s\n", ex);
		}
		
		try {
		Scanner input = new Scanner(ftest);
		String name = input.nextLine();
		int age = input.nextInt();
		
		System.out.printf("Name: %s\n" + "Age: %d\n", name, age);
		} catch (FileNotFoundException ex) {
			System.out.printf("ERROR: %s\n", ex);
		}
	}

}
