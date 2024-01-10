package task8;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in); // import scanner from java.utill
		
		System.out.println("Enter the value of num:");
		int num = sc.nextInt();
		System.out.println(num); // To get a value from user
			
boolean prime = true; // boolean is used to set true value for prime numbers 

for (int i = 2;i < num; i++) {
if(num%i==0) { // if the given number is divisible by i value and returns value as 0 ten

	prime=false;
    break;
}
	}
if(prime==true) { //if condition satisfies then print as Prime
	System.out.println("Prime number:"+num); // Concatenate num
}
else {
	System.out.println("Not a Prime number");
}	
	}
	}
	

