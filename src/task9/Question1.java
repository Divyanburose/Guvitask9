package task9;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
System.out.println("Enter a string:");
String input = sc.next();

boolean Palindrome = true;

for (int i=0; i<input.length() / 2;i++) {
	if(input.charAt(i) != input.charAt(input.length() -1 -i)) {
		Palindrome = false;
		break;
	}
	
}
if (Palindrome) {
	System.out.println("The string is Palindrome");
} else {
	System.out.println("The string is not a Palindrome");	
}
	}

}
