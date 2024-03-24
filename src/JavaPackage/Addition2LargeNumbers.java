//Write a Java Program to add two big integers.

package JavaPackage;

import java.math.BigInteger;
import java.util.Scanner;

public class Addition2LargeNumbers {

	public static void main(String[] args) {
		
		String n1, n2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 Large Number for addition: ");
		
		n1 = sc.nextLine();
		BigInteger b1 = new BigInteger(n1);
		
		
		n2 = sc.nextLine();	
		BigInteger b2 = new BigInteger(n2);
		
		
		BigInteger sum= b1.add(b2);
		
		System.out.println("The Addition of 2 Numbers "+n1+" and "+n2+" is: " +sum);
	}

}
