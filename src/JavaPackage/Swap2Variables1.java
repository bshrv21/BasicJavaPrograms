//Write a Java Program to Swap 2 Integers using 3rd variable.

package JavaPackage;

public class Swap2Variables1 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c;
		
		System.out.println("The Integers before swapping: "+a+ " " +b);
		
		c = b;
		b = a;
		
		
		System.out.println("The integers after Swap are: "+c+ " " +b);

	}

}
