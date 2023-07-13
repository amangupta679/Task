package exceptionDemo;
import java.util.Scanner;
public class trycatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int a = sc.nextInt();
		System.out.println("enter the second number");
		int b = sc.nextInt();
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException ex) {
			System.out.println("divide by zero in invalid");
		
		}
		System.out.println("end");
	}

}
