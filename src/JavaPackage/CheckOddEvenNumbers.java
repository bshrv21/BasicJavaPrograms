//Write a Java Program to find out the Number is Even or Odd

package JavaPackage;

import java.util.Scanner;

public class CheckOddEvenNumbers {

	public static void main(String[] args) {
		
		int number;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		
		number = sc.nextInt();
		
		if(number%2==0)
			System.out.println("The Number entered "+number+" is Even Number.");
		else
			System.out.println("The Number entered "+number+" is Odd Number.");
	}

}
