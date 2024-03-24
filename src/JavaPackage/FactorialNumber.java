//Write a Java Program to find a Factorial of a Program

package JavaPackage;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		
		int i, number, factorial=1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		
		number = sc.nextInt();
		
		for(i=1; i<=number; i++)

			factorial = i*factorial;

		System.out.println("The factorial of the Number "+number+" is: "+factorial);
			

	}

}
