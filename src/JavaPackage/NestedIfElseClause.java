//Write a Java Program for Nest IF Else Clause

package JavaPackage;

import java.util.Scanner;

public class NestedIfElseClause {

	public static void main(String[] args) {
		
		int totalmarks=100, obtainedmarks, passmarks=35;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter you marks: ");
		
		obtainedmarks = sc.nextInt();
		
		if(obtainedmarks>=passmarks)
			if(obtainedmarks>=90)
				System.out.println("Your grage is A");
			else if(obtainedmarks>=80)
				System.out.println("Your grade is B");
			else
				System.out.println("Your grade is C");
		else
			System.out.println("You are not passed in the Exams.");
	
	}

}
