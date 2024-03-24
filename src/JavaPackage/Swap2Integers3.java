//Write a Java Program to Swap 2 Integers by Input values without any 3rd variable

package JavaPackage;

import java.util.Scanner;

public class Swap2Integers3 {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 Integers: ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("The 2 Integers before Swapping: "+a+" " +b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("The 2 Integers after swapping: "+a+" "+b);
		
		

	}

}
