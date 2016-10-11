import java.util.Scanner;

public class CheckOddEven {
	
	public static void main(String[] args) {
		
		int intg;
		System.out.println("Enter a integer:");
		intg=new Scanner(System.in).nextInt();
		if(intg%2==0)
			System.out.println("The input integer is Even Number.");
		else
			System.out.println("The input integer is Odd Number.");
	}

}
