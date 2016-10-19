import java.util.Scanner;

public class Continue {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i ++) {
			if(i==0||i==2){
				continue;
			}
			else if(i==4){
				break;
			}
			System.out.println(i);
		}
	}
}
