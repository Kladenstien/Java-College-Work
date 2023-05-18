package Chapter3;

import java.util.Scanner;

public class PetTest {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		//Creating New Object For Input Values
		Pet pet = new Pet();
		
		System.out.println("This programme shows your pet information you type in.");
		
		//Requesting User Input For Pets Name 
		System.out.print("\nPlease enter your pet's name: ");
		String n = keyboard.nextLine();
		pet.setName(n);
		
		//Requesting User Input For Type Of Pet 
		System.out.print("Please enter your pet's type: ");
		String t = keyboard.nextLine();
		pet.setType(t);
		
		//Requesting User Input For Age Of Pet 
		System.out.print("Please enter your pet's age: ");
		int a = keyboard.nextInt();
		pet.setAge(a);
		
		//Printing Users Inputs.
		System.out.println("\nYour pet's name is " + pet.getName() + ".");
		System.out.println("Your pet's type is " + pet.getType() + ".");
		System.out.println("Your pet's age is " + pet.getAge() + ".");
		
		keyboard.close();

	}

}