package task9;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the String");
		String rev ="";
		String a= sc.nextLine();
		int len = a.length();	// Getting length  of string
		
		for (int i= len-1; i>=0;i--) // Reversing the string with for loop using charAt method
		{
			rev = rev+a.charAt(i);
		}
System.out.println("Reversal string is :" +rev);
		
		
	}

}
