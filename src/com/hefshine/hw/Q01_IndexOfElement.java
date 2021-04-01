package com.hefshine.hw;
import java.util.*;
public class Q01_IndexOfElement 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int a[]=new int [size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter "+i+"th element");
			a[i]=sc.nextInt();
		}
		System.out.println("Enter element to be search: ");
		int key=sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			if(a[i]==key)
				System.out.println(key+" Element found at "+i+" index");
		}
	}

}
