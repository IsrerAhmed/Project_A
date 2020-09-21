package exercise_page_32_OOP_Concept;
//4. A Dog class that holds a dog's name and speak method.
//This method always say "Woooof".



//A
//Labrador is a dog which has color, breedWeight and getWeight method which will return labrador's
//breedWeight.
//Develop a Test class to create dog object and labrador object and display their member (name, color,
//weight, speak) in console.
public class Dog {
 
	String name;
	
	
public Dog(String n) {
	
	
	name=n;
	
}
// we are going to create a object level method  which name is speak.
public void speak() {
	
 System.out.println("Wooof");
}
	
	
}
