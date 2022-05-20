/*
   Program to find area of Different figures using user Input
   */ 

	package com.edu.ind;
	import java.util.Scanner;
	public class AreaofFigures
	{

		public static void main(String[] args) {
			float side,base,height,length,breadth,radius;
			float area;
			Scanner sc=new Scanner(System.in);
			System.out.println("Area of Rectangle");
			System.out.println("Enter length and breadth");
			length=sc.nextFloat();
			breadth=sc.nextFloat();
			area=length*breadth;
			System.out.println("Area of rectangle="+area +" squnits");
			System.out.println("the area of reactangle length="+length+" and breadth="+breadth+" and the area is " +area +"squnits");
			System.out.println("Area of circle");
			System.out.println("Enter Radius");
			radius=sc.nextFloat();
			area=3.14f*radius*radius;
			System.out.println("Area of Circle is="+area +" squnits");
			System.out.println ( "the area of circle has radius= "+radius+" then it's area is "+area +"squnits" );
			System.out.println("Area of Square");
			System.out.println("Enter side");
			side=sc.nextFloat();
			area=side*side;
			System.out.println("Area Square is="+area +" squnits");
			System.out.println("the area of square has a side="+side+" and the area is "+area +"squnits");
			System.out.println("Area of Triangle");
			System.out.println("Enter base and height");
			base=sc.nextFloat();
			height=sc.nextFloat();
			area=0.5f*base*height;
			System.out.println("Area of Triangle="+area + " squnits");
			System.out.println("the area of triangle has height="+height+" and base="+base+" it's area is " +area +"squnits");
			

	
	//
			
	}

}
