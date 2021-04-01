//Write a program sort array elements in ascending order using bubble sort.
//o/p [1, 2, 3, 4, 5, 6, 7, 8, 9]
package com.hefshine.hw;

import java.util.Arrays;

public class Q07_BubbleSort {

	public static void main(String[] args) 
	{
		int a[]= {9,6,1,8,4,2,7,5,3};
		bubleSort(a);
	}

	private static void bubleSort(int[] a) 
	{
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length-i-1; j++) 
			{
				if(a[j]>a[j+1]) 
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
