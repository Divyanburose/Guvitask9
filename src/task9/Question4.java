package task9;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the patteren:");
int size = sc.nextInt();
printPattern (size);
	}
	private static void printPattern(int size) 
	{
		
		 for(int i = 1; i <= size; i++) {
			for(int j = 1; j <= size; j++) {
				if (i == j|| i + j == size) {
					System.out.println();
			}
				else 
				{
					System.out.print("*  *");
					System.out.print("* *");
					System.out.print(" * ");
					System.out.print("* *");
					System.out.print("*  *");
					}
				{
				System.out.println();
		}
			}
		 } 
	}
}			
		 	


