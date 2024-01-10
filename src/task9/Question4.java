package task9;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in); // import scanner from java.utill 
		System.out.println("Enter the size of the patteren:"); //To print the pattern size
int rows = sc.nextInt();
	
		
		 for(int i = 1; i <= rows; i++) { // number of rows is determined
			for(int j = 1; j <= rows; j++) { // number of columns is determined
				
				if (i == j|| i + j == rows + 1) { //rows = columns or row no + col no = row +1
					 
					System.out.print("*");
				}
					System.out.print(" ");
					}
				{
				System.out.println(); // new line
		}
			}
		 } 
	}
			
		 	


