//Write a program to test if an array contains a specific value
package com.hefshine.hw;
import java.util.*;
public class Q02_SpecificValue 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a[]= {1,2,3,4,5,6,7,8};
		System.out.println("Enter value to check: ");
		int key=sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			if(a[i]==key)
				System.out.println("araay conatains "+key);
		}

	}

}
