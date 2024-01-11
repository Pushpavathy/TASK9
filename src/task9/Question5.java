package task9;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mark: ");
		int a= sc.nextInt();
		if (a==100) 								// if input mark is equal to 100 print grade as S
		{
			System.out.println("Your grade is S");
		}
		else if (a>=90 && a<100)	//if input mark is less than 100 and greater than or equal to 90 print grade as A
		{
			System.out.println("Your grade is A");
		}

		else if (a>=80 && a<90) 	//if input mark is less than 90 and greater than or equal to 80 print grade as B
		{
			System.out.println("Your grade is B");
		}
		else if (a>=70 && a<80)		//if input mark is less than 80 and greater than or equal to 70 print grade as C
		{
			System.out.println("Your grade is C");
		}
		else if (a>=60 && a<70)   //if input mark is less than 70 and greater than or equal to 60 print grade as D
		{
			System.out.println("Your grade is D");
		}
		else if (a>=50 && a<60)		//if input mark is less than 60 and greater than or equal to 50 print grade as E
		{
			System.out.println("Your grade is E");
		}
		else if (a<50)			//if input mark is less than 50 print grade as F 
		{
			System.out.println("Your grade is F");
		}
		else if (a>100)			//if input mark is greater than 100 print as invalid input
		{
			System .out.println("Invaid Input");	
		}

	}

}
