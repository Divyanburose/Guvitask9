package task9;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string:");
String input = sc.next();//gets string value from user

String reversed = "";
for (int i = input.length() -1; i >= 0; i--) { //get input hen calculate its length
	reversed +=input.charAt(i);
}
System.out.println("Reversed string: "+reversed);//prints reversed string value
	}

}
