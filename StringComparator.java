import java.util.Scanner;

public class StringComparator {
	
	public static void main(String[] args) {
		String a,b;
		while(true){
			System.out.println("Enter string 1:");
			a = new Scanner(System.in).nextLine();
			System.out.println("Enter string 2:");
			b = new Scanner(System.in).nextLine();
			if(a.equalsIgnoreCase(b)){
				System.out.println("The two strings are the same.");
				break;
			}
			else
				System.out.println("The two strings are not the same.");
		}
	}
}
