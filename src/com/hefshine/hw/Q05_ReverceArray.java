//Write a program to find and display reverse of an array using third variable
package com.hefshine.hw;

import java.util.Arrays;

public class Q05_ReverceArray 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		System.out.println("Array Before Reverce"+Arrays.toString(a));
		int left=0;
		int right=a.length-1;
		for (int i = 0; i < a.length/2; i++) 
		{
			int temp=a[left];
			a[left]=a[right];
			a[right]=temp;	
			left++;
			right--;
		}
		System.out.println("Array after reverce:"+Arrays.toString(a));
	}

}
