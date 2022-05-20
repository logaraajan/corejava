package project3;
import java.util.Scanner;
public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String customername;
		float billamt;
		int noofunits;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Customer Name");
		customername=sc.nextLine();
		System.out.println("No of units");
		noofunits=sc.nextInt();
		if(noofunits <= 100)
		{
			billamt = noofunits*2; 
		}
		else if(noofunits>100 && noofunits<=300)
		{
			billamt= 100*2.0f+(noofunits-100)*3.0f;
		}
		else if(noofunits>300 && noofunits<=300)
		{
			billamt= 100*2.0f+(noofunits-100)*3.0f;
		}
		else
		{
			billamt=100*2.0f +200*3.0f+(noofunits-300)*5.0f;
			float surch=(billamt*2.5f)/100;
			billamt=billamt+surch;
		}
		System.out.println("Customer Name : " +customername);
		System.out.println("No of units consumed : " +noofunits);
		System.out.println("Bill amount is " +billamt);
		sc.close();


	}

}
