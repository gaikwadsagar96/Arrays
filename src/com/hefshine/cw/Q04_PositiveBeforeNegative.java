//Write a program to arrange the elements of an given array of integers where all positive integers appear before all the negative integers.
package com.hefshine.cw;

public class Q04_PositiveBeforeNegative 
{

	public static void main(String[] args) 
	{
		int a[]= {-1,5,-3,0,6,-4,8-4,-8};
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				if(i!=j)
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
				j++;
			}	
		}
		for(int x:a)
			System.out.print(x+" ");

	}

}
