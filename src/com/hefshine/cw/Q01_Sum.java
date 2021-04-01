//Write a program to calculate sum and average of array elements
package com.hefshine.cw;

public class Q01_Sum 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		int sum = 0,average;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println(sum);

	}

}
