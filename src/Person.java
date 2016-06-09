
public class Person {

	private String name;
	private int age = 0;
	private String hairColor;
	
	public Person(){}
	
	public void setName(String newName){
		
		this.name = newName;
	}
	
	public String getName(){
		
		return name;
	}
	
	public void setAge(int newAge){
		
		this.age = newAge;
	}
	
	public int getAge(){
		
		return age;
	}
	
	public void setHairColor(String newHairColor){
		
		this.hairColor = newHairColor;
	}
	
	public String getHairColor(){
		
		return hairColor;
	}
}
