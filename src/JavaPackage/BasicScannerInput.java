//Write a Java Program to take an Input using Scanner Class.

package JavaPackage;

import java.util.Scanner;

public class BasicScannerInput {

	public static void main(String[] args) {
		
		int i;
		String s;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Integer: ");
		i = sc.nextInt();
		System.out.println("The Integer you entered is: "+i+ "\n");
		
		Scanner st = new Scanner(System.in);
		System.out.println("Enter any String: ");
		s = st.nextLine();
		System.out.println("The String you entered is: " + s);
		

	}

}
