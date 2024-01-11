package task9;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String rev ="";				// Declaring rev variable
		String a ="";
		System.out.println("Enter the word"); // Getting the value
		a = sc.nextLine();
		int len = a.length();	// Getting length  of string
		
				for (int i= len-1; i>=0;i--) // Reversing the string with for loop using charAt method
				{
					rev = rev+a.charAt(i);
				}
		System.out.println("Reversal string is :" +rev);
		
		if(a.equals(rev))
			System.out.println("String is a palindrom");
			else
			System.out.println("String is not a palindrome");
		
		
		
		

	}

}
