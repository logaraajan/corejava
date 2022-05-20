package project3;
import java.util.Scanner;
public class Dslr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char symbol;
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter a symbol");
		symbol= sc.next().charAt(0);
		switch(symbol)
		{
		case '+' :
		{
			System.out.println("Addition= "+(a+b));
			break;
		}
		case '-' :
		{
			System.out.println("Subtraction= "+(a-b));
			break;
		}
		case '*' :
		{
			System.out.println("Multiplication= "+a*b);
			break;
		}
		case '/' :
		{
			System.out.println("Division= "+(a/b));
			break;
		}
		default:
		{
			System.out.println("Invalid input");
		}
		}
		sc.close();


	}

}
