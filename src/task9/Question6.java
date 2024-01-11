package task9;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the month:"); //Getting the month value
		
		int a = sc.nextInt();
		
		System.out.println("Enter the room rent per day:"); //getting the room rent per day
		
		float b = sc.nextFloat();
		
		System.out.println("Enter the no of days stayed in the hotel:"); // getting no of days stayed in hotel
		
		int c = sc.nextInt();
		
		double normal = b*c;		//Calculating the room rent based on the no of days stayed
		
		double  peak = (b*c)*1.2; //Calculating the room rent 20% higher than usual rate
		
		switch(a)					//switch case for mentioning the month
		{
		case 1:
			System.out.printf("Room rent is:"+String.format("%.2f",normal));
			break;
		case 2:
			System.out.printf("Room rent is:"+String.format("%.2f",normal));
			break;
		case 3:
			System.out.printf("Room rent is:"+String.format("%.2f",normal));
			break;
		case 4:
			System.out.printf("Room rent is:"+String.format("%.2f",peak));
			break;
		case 5:
			System.out.printf("Room rent is:"+String.format("%.2f",normal));
			break;
		case 6:
			System.out.printf("Room rent is:"+String.format("%.2f",peak));
			break;
		case 7:
			System.out.printf("Room rent is:"+String.format("%.2f",normal));
			break;
		case 8:
			System.out.printf("Room rent is:"+String.format("%.2f",normal));
			break;
		case 9:
			System.out.printf("Room rent is:"+String.format("%.2f",normal));
			break;
		case 10:
			System.out.printf("Room rent is:"+String.format("%.2f",normal));
			break;
		case 11:
				System.out.printf("Room rent is:"+String.format("%.2f",peak));
				break;
		case 12:
			System.out.printf("Room rent is:"+String.format("%.2f",peak));
			break;
		default:
			System.out.printf("Room rent is:"+String.format("Invalid input"));
			
		
		}
		
		
		
		
		
		

	}

}
