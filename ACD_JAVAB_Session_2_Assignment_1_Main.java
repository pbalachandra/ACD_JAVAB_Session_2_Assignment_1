package session2;

import java.util.Scanner;

public class ACD_JAVAB_Session_2_Assignment_1_Main 
{
	public static void main(String[] args) 
	{
		int age;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Age : ");
		age = s.nextInt();
		s.close();
		if (age >=1 && age <=100)
		{	
			if (age >= 18)
				System.out.println("You are eligible to vote");
			else
				System.out.println("You are not eligible to vote");
		}
		else
			System.out.println("Invalid Age");
	}
}
