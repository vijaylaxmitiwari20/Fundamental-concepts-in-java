package conditionalstatemnt;
import java .util.Scanner;
public class Greatestoftwo {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter first number :");
		int a = sc.nextInt();
		
		System.out.println("Enter second number :");
		int b= sc.nextInt();
		
		if(a>b) {
			System.out.println("A is greater..");
		}else if (b>a) {
			System.out.println("B is greater..");
			
	
		}
		else {
			System.out.println("Both are equal..");
			
		}
		
	}

}
