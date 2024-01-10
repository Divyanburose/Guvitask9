package task9;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int marks = sc.nextInt();
System.out.println("Enter the marks:"+marks); //to get input from the user

if (marks == 100) {  //marks equals to 100 then grade S
System.out.println("S");
	} 
else if (marks >= 90 && marks <= 99) { //marks greater or equal 90 and less than or equal to 99 then grade A 		
	System.out.println("A");
		}
else if (marks >= 80 && marks <= 89) {  //marks greater or equal 80 and less than or equal to 89 then grade B
	System.out.println("B");
}
else if (marks >= 70 && marks <= 79) {  //marks greater or equal 70 and less than or equal to 79 then grade C
	System.out.println("C");
}
else if (marks >= 60 && marks <= 69) {  //marks greater or equal 60 and less than or equal to 69 then grade D
	System.out.println("D");
}
else if (marks >= 50 && marks <= 59) {  //marks greater or equal 50 and less than or equal to 59 then grade E
	System.out.println("E");
}
else if (marks < 50) { //less than 50 then fail
	System.out.println("Fail");
	}
	
	}

}
