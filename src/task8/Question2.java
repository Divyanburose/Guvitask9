package task8;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // import scanner from java.utill
System.out.println("Enter the number:");
int num = sc.nextInt();
System.out.println(num); //To get value from user
if(num%2==0) { // if the given number is divisible by 2
	System.out.println("Even number");
} else {
	System.out.println("Odd number");
}
sc.close();
	}
}
