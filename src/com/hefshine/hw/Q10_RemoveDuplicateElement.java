/*Write a program to remove the duplicate elements of a given array and return the new length
of the array*/
package com.hefshine.hw;

import java.util.Arrays;

public class Q10_RemoveDuplicateElement 
{

	public static void main(String[] args) 
	{
	int a[]= {1,2,5,3,1,2,7,4,3};
	int cnt=0;
	System.out.println("Array before removing duplicate elements: "+Arrays.toString(a));
	
	for (int i = 0; i < a.length; i++) 
	{
		for (int j = i+1; j < a.length; j++) 
		{
			if(a[i]==a[j]&& a[i]!=0)
			{
				a[j]=0;
				cnt++;
			}
		}
	}
	System.out.println("length before removing element:"+a.length);
	a=newArray(a,cnt);
	System.out.println("length after removing element:"+a.length);
	System.out.println("Array after removing duplicate elements: "+Arrays.toString(a));
	System.out.println("Duplicate Elments:"+cnt);
	}

	private static int[] newArray(int[] a, int cnt) 
	{
		int a1[]=new int[a.length-cnt];
		for (int i = 0, j=0; i < a.length; i++) 
		{
			if(a[i]!=0)
			{
				a1[j]=a[i];
				j++;
			}
			else {
				i++;
			}
		}
		return a1;
	}

}
