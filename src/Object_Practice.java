import java.util.Scanner;

public class Object_Practice {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);					// Scanner for numerical input
		Scanner sInput = new Scanner(System.in);				// Scanner for string input
		
		System.out.println("How many people are we tracking?");
		int numOfPeople = input.nextInt();
		
		Person[] listOfPeople = new Person[numOfPeople];		// Declaration of an array of Person objects
		
		for (int i = 0; i < listOfPeople.length; i++){
			
			listOfPeople[i] = new Person();
			
			System.out.printf("Person number %d, name: \n", (i + 1));
			String newName = sInput.next();
			listOfPeople[i].setName(newName);
			
			System.out.printf("Person number %d, age: \n", (i + 1));
			int newAge = input.nextInt();
			listOfPeople[i].setAge(newAge);
			
			System.out.printf("Person number %d, hair color: \n", (i + 1));
			String newHairColor = sInput.next();
			listOfPeople[i].setHairColor(newHairColor);
		}
		
		for (int j = 0; j < listOfPeople.length; j++){
			
			System.out.println(listOfPeople[j].getName());
			System.out.println(listOfPeople[j].getAge());
			System.out.println(listOfPeople[j].getHairColor());
			System.out.println();
		}
	}

}
