package task8;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in); // import scanner from java.utill
		
		System.out.println("Enter the value of a:");
		int a = sc.nextInt();
		System.out.println(a); // To get a value from user
		
		System.out.println("Enter the value of b:");
		int b = sc.nextInt();
		System.out.println(b);// To get b value from user
	
		System.out.println("Before swap");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
		int c = a; // c value is considered as value for a
		a = b; // a value is considered as value for b
		b = c; // b value is considered as value for c
		System.out.println("After swap");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		
	}

}
