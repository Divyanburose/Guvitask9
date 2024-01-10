package task9;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the first number:");
		int num1 = sc.nextInt();  //get num1 value
		
		System.out.println("Enter the second number:");
		int num2 = sc.nextInt();   //get num2 value
		
		System.out.println("Enter the third number:");
		int num3 = sc.nextInt();   //get num3 value
	
	int largest = (num1 > num2) ? (num1 > num3 ? num1 : num3): (num2 > num3 ? num2 : num3);//compare the 3 numbers with each other.
	System.out.println("The largest number is:"+largest);
	
	}
	

}
