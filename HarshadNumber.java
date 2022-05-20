package project5;
import java.util.Scanner;
public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,digit,sum,l;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		num=sc.nextInt();
		sum=0;
		l=num;
		while(num>0)
		{
			digit=num%10;         
			sum=sum+digit;
			num=num/10;
		}
		if(l%sum==0)
		{
			System.out.println(l+" is a Harshad Number ");
		}
		else
		{
			System.out.println(l+" is not a Harshad Number");
		}
		
		sc.close();



	}

}
