package task8;
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); // import scanner from java.utill
		
		System.out.println("Enter the value of a:");
		int a = sc.nextInt();
		System.out.println(a); // To get a value from user
		
		System.out.println("Enter the value of b:");
		int b = sc.nextInt();
		System.out.println(b);// To get b value from user
		
		System.out.println("Enter the value of c:");
		int c = sc.nextInt();
		System.out.println(c);// To get c value from user
		
		System.out.println("Enter the value of d:");
		int d = sc.nextInt();
		System.out.println(d);// To get d value from user
		if(a+b > c+d) { // If the value a + b is greater than c+d then print the below sysout staement
			System.out.println("Sum of a and b is greater than sum of c and d");
		} 
}

}


