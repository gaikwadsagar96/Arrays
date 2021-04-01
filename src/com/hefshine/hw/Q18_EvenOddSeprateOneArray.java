/*Write a program to separate even and odd numbers of an given array of
integers. Put all even numbers first, and then odd numbers.*/
package com.hefshine.hw;

import java.util.Arrays;

public class Q18_EvenOddSeprateOneArray 
{
	
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		evenoddSeprate(a);

	}
	private static void evenoddSeprate(int[] a) 
	{
		int k=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
			{
				int t=a[i];
				a[i]=a[k];
				a[k]=t;
				k++;
			}
		}
		System.out.print(Arrays.toString(a));
		/*int left=0,right=a.length-1;
		for (int i = 0; i < a.length; i++) 
		{
			while(a[left]%2==0)
			{
				left++;
			}
			while(a[right]%2==1)
			{
				right--;
			}
			if(left<right)
			{
				int temp=a[left];
				a[left]=a[right];
				a[right]=temp;
			}
		}
		System.out.println(Arrays.toString(a));*/
	}

}
