//Write a program to print the addition of two matrices
package com.hefshine.hw;

import java.util.Arrays;

public class Q21_AdditionOfMatrix 
{
	public static void main(String[] args) 
	{
		int a1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int a2[][]={{1,2,3},{4,5,6},{7,8,9}};
		int sum[][]=new int[a1.length][a1[0].length];
		//System.out.println(Arrays.deepToString(a3));
		for (int i = 0; i < a2.length; i++) 
		{
			for (int j = 0; j < a2[0].length; j++)
			{
				sum[i][j]=a1[i][j]+a2[i][j];
			}
		}
		System.out.println(Arrays.deepToString(sum));

	}

}
