/*Write a program to get the difference between the largest and smallest
values in an array of integers*/
package com.hefshine.hw;

public class Q16_DiffernceBetLargeSmallElement 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		int large=a[0],small=a[0];
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 1; j < a.length; j++) 
			{
				if(a[j]>large)
				{
					large=a[i];
				}
				if(a[j]<small)
				{
					small=a[j];
				}
			}
		}
		System.out.println("small number: "+small+" Large number: "+large+" Difference: "+(large-small));

	}

}
