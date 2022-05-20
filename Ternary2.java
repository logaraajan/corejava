package project3;
import java.util.Scanner;
public class Ternary2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int num1,num2,num3,lar;
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter 3 numbers :");
				num1=sc.nextInt();
				num2=sc.nextInt();
				num3=sc.nextInt();
				lar=(num1>num2)&&(num1>num3)?num1:(num2>num3)?num2:num3;
				System.out.println("The largest of "+num1+ " and "+num2+ " and "+num3+ " is "+lar);
				sc.close();


	}

}
