package task9;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int month = sc.nextInt();
System.out.println("Enter the number of month:");//to get input from the user
System.out.println(month);

float rent = sc.nextFloat();
System.out.println("Enter the room rent:");
System.out.println(rent);  //to get input from the user

int stay = sc.nextInt();
System.out.println("Number of days stayed in the hotel:");
System.out.println(stay);   //to get input from the user

switch(month) {
case 4,5,6,11,12://April,may,june,nov,dec peak months
System.out.println((rent + rent * 20/100)* stay);//20% high during peak month calculation
break;
default:
System.out.println(stay * rent);
	}
	}
}


	
