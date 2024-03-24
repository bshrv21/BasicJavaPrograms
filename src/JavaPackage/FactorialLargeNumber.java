//Write a Java Program to find a Factorial for a Large Number

package JavaPackage;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialLargeNumber {

	public static void main(String[] args) {
		
		int i, number;
		BigInteger inc = new BigInteger("1");
		BigInteger factorial = new BigInteger("1");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Large Number: ");
		
		number = sc.nextInt();
		
		for(i=1; i<=number; i++) {
		factorial = factorial.multiply(inc);
		inc = inc.add(BigInteger.ONE);
		}
		System.out.println("The factorial of the Number "+number+" is: "+factorial);
			

	}

}
