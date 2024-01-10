package task9;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int row = 4; //number of rows
int count = 1;//execution starts with 1

for (int i = 1; i<=row; i++) { //value of i starts with 1 and it should be less than or equal to rows then looping starts
	for (int j =1; j<= i; j++) {  ////value of j starts with 1 and it should be less than or equal to i then looping starts
		System.out.print(count +"");
		count++;
	}
	System.out.println();
}
	}

}
