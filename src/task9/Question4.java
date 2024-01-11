package task9;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the value: ");
	 
	        int a = sc.nextInt();         	// Getting the value   
	        
	        for (int i = 0; i < a; i++)  
	        {
	            for (int j = 0; j < a; j++)
	            {
	              if ( i==j || i+j==a-1)  //Checks for the place where to print *
	              {
	                System.out.print("*");
	              } else
	              {
	                System.out.print(" ");
	              }
	            }
	            System.out.println();
	          }
	        }
	      }