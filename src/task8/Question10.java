package task8;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in); // import scanner from java.utill

System.out.println("Enter an integer:");
int num = sc.nextInt(); // getting integer value from the user

int count = 0; // count datatype initialized to zero
while (num !=0) { //number is not equal to 0
num/=10;// num divided by 10 is the value num.
count++; //Looping occurs starts from 0+1 and increased by 1 for each integer.
}
System.out.println("Number of digits:"+count);// Concatenate +count 
	}

}
