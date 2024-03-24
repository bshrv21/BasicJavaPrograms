//Write a Java Program to add 2 numbers

package JavaPackage;

import java.util.Scanner;

public class Addition2Numbers {

	public static void main(String[] args) {
		
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 Numbers for Additon: ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		int addition = a+b;
		
		System.out.println("The Addition of 2 Numbers "+a+" and "+b+" is: " +addition);
		

	}

}
