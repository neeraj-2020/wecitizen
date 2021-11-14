package com.tutorials.basics;

import java.util.Scanner;

public class NaturalNumbers {

	void print()
	{
		
		int n,c,se=0,so=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for n");
		n=sc.nextInt();
		c=1;
		while(c<=n)
		{
			if(c%2==0) 
				se = se + c;
			else
				so = so + c;
			c++;
		}
		
		System.out.println("Sum of even numbers;"+se);
		System.out.println("Sum of odd numbers;"+so);
		sc.close();	
	}	
	public static void main(String[] args) {
		NaturalNumbers obj = new NaturalNumbers();
		obj.print();

	}

}
