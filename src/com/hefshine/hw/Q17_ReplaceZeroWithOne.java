//Write a program to replace 0’s with 1’s. e.g array is [0,1,0,1,0,1,0,1,0,1,0,1,0].
package com.hefshine.hw;

import java.util.Arrays;

public class Q17_ReplaceZeroWithOne 
{

	public static void main(String[] args) 
	{
		int a[]= {0,1,0,1,0,1,0,1,0,1,0,1,0};
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==0)
				a[i]=1;
		}
		System.out.println(Arrays.toString(a));

	}

}
