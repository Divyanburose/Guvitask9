package task8;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);// import scanner from java.utill
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		System.out.println(num); // getting input from user
		
int fact=1; // initializing the value as 1 for fact
for (int i = 1; i <= num; i++) { // value for i is initialized as 1 and i value is less or equal to num then looping starts.
	fact=fact*i;
}
System.out.println("Factorial: "+fact);
}
	}


