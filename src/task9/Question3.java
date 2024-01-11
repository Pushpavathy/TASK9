package task9;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the value"); //Getting the value
		int a = sc.nextInt();
		int n =1;
		for(int i=0;i<a;i++)			// Outer for loop
		{
			for (int j=0;j<=i;j++)		//Inner for loop
			{
				System.out.print(n); 	//Printing the value
				n++;
			}
			System.out.println();
		}


	}

}
