//Write a Java Program for If Else Clause

package JavaPackage;

import java.util.Scanner;

public class IfElseClause {

	public static void main(String[] args) {
		
		String name = "Java";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name:");
		
		name = sc.nextLine();
		
		if(name.equals("Java"))
			
			System.out.println("Hello World");
		
		else
			
			System.out.println("Sorry, your name is invalid");

	}

}
