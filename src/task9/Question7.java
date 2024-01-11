package task9;

import java.util.Scanner;

public class Question7 {
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: "); //Get a using scanner class
		int a =sc.nextInt();
		System.out.println("Enter the value of b: ");//Get b using scanner class
		int b =sc.nextInt();
		System.out.println("Enter the value of c: ");//Get c using scanner class
		int c =sc.nextInt();
		if ((a>b)&&(a>c))							//If a is greater than b &c print a is greater
		{
			System.out.println("a is greater");
		}
		else if ((b>a)&&(b>c))						//If b is greater than a &c print b is greater
		{
			System.out.println("b is greater");
		}
		else									// else print c is greater
		{
			System.out.println("c is greater");
		}
		
		
	}

}
