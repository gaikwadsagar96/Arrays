//Write a program to copy an array by iterating the array.
package com.hefshine.hw;

import java.util.Arrays;

public class Q04_CopyAraayByIterating {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8,9,0};
		int copya[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			copya[i]=a[i];	
		}
		
		System.out.println("Original Array:"+Arrays.toString(a));
		System.out.println("copy of  Array:"+Arrays.toString(copya));
		
	}

}
