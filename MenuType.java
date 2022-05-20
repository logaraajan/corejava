package project3;
import java.util.Scanner;
public class MenuType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, ans;
		String op;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("-----------MENU------------");
		
		System.out.println("ADD for addition");
		System.out.println("SUB for subtraction");
		System.out.println("MUL for multiplication");
		System.out.println("DIV for division");
		System.out.println("Enter Your option");
		op=sc.next();
		
		switch(op) {
		case "ADD": ans=num1+num2;
		             System.out.println("Sum="+ans);
		             break;
		case "SUB": ans=num1-num2;
					System.out.println("Difference="+ans);
        			break;
		case "MUL": ans=num1*num2;
        			System.out.println("product="+ans);
        			break;
		case "DIV": 
			         if(num2==0) {
			        	 System.out.println("Divide by zero error");
}
			         else {
			        	 ans=num1/num2;
			        	 System.out.println("Quotient="+ans);
			         }
			break;
		}
		
	}
	
}




