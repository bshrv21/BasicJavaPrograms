// Write a Java program to swap 2 Integers using Input values.
package JavaPackage;

import java.util.Scanner;

public class Swap2Integers2 {

	public static void main(String[] args) {
		
		int a, b, c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 Integers to swap:" );
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("2 Integers before swapping: "+a+ " " +b);
		
		c=b;
		b=a;
		
		System.out.println("2 Integers after swapping: "+c+" "+b);
		
	}

}
