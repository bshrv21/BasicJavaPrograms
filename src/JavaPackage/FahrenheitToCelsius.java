//Write a Java Program to convert Fahrenheit to Celsius

package JavaPackage;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		
		float fahrenheit;
		
		float celsius;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Fahrenheit value: ");
		
		fahrenheit = sc.nextFloat();
		System.out.println("The entered Fahrenheit Value is: "+fahrenheit+ "\n");
		
		//Formula to convert Fahrenheit to Celsius
		
		celsius = ((fahrenheit -32)*5/9);
		
		System.out.println("The Celsius Value is: "+celsius);

	}

}
