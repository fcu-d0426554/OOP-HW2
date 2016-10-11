import java.util.Scanner;

public class KeyboardScanner {
	
	public static void main(String[] args) {
		
		String na;
		int intg;
		float num,temp;
		System.out.println("Enter a integer:");
		intg = new Scanner(System.in).nextInt();
		System.out.println("Enter a float point number:");
		num = new Scanner(System.in).nextFloat();
		System.out.println("Enter your name :");
		na = new Scanner(System.in).nextLine();
		temp=intg*num;
		System.out.printf("Hi %s,the multiplication of %d and %f is %.2e",na,intg,num,temp);
	}

}
