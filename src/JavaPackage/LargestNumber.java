//Write a Java Program to find the Largest Number

package JavaPackage;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Numbers: ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		
		if(a>b&&a>c)
		{
			System.out.println("The Largest number among "+a+","+b+","+c+" is: "+a);
		}
		else if(b>a&&b>c)
		{
			System.out.println("The Largest number among "+a+","+b+","+c+" is: "+b);
		}	
		else
		{
			System.out.println("The Largest number among "+a+","+b+","+c+" is: "+c);
		}

	}

}
