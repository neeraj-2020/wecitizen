/**
 * 
 */
package com.tutorials.basics;

import java.util.Scanner;

/**
 * @author Neeraj Sinha
 *
 */
public class MathsTable {

	/**
	 * @param args
	 */
	
	void table()
	{
		
		float i,j;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Numbers");
		i=sc.nextFloat();
		for(j=1; j<=10; j++)
		{
			System.out.println(i+" " "X"+ j+ "="+ i*j);
			System.out.println();
			};
		sc.close();

	}
	public static void main(String[] args) {
		
		MathsTable obj = new MathsTable();
		obj.table();
	}

}
