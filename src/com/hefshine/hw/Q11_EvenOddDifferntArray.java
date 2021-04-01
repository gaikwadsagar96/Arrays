/*Write a program to put even and odd elements of array in two separate arrays.

o/p
Original Array:[1, 2, 3, 4, 5, 6, 7, 8, 9]
Even Array:[2, 4, 6, 8]
Odd Array[1, 3, 5, 7, 9]*/
package com.hefshine.hw;

import java.util.Arrays;

public class Q11_EvenOddDifferntArray 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		System.out.println("Original Array:"+Arrays.toString(a));
		int evencnt=0,oddcnt=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
			{
				evencnt++;
			}
			else
				oddcnt++;
		}
		int  even[]=new int[evencnt];
		int odd[]=new int[oddcnt];
		
		for (int i = 0,j=0,k=0; i < a.length; i++) 
		{
			if(a[i]%2==0)
			{
				even[j]=a[i];
				j++;
			}
			else
			{
				odd[k]=a[i];
				k++;
			}
		}
		System.out.println("Even Array:"+Arrays.toString(even));
		System.out.println("Odd Array"+Arrays.toString(odd));

	}

}
