package task8;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in); // import scanner from java.utill

System.out.println("Enter the age:");
int num = sc.nextInt();
System.out.println(num); //get age from user

if(num >= 60)  { //age is greater than or equal to 60 senior citizen
	System.out.println("Person is senior citizen");
}
else {
	System.out.println("Person is not a senior citizen");
}
	}

}
