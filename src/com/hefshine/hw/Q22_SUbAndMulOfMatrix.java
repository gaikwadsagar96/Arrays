//Write a program to calculate the subtraction and multiplication of two matrices entered by the user
package com.hefshine.hw;

import java.util.Arrays;

public class Q22_SUbAndMulOfMatrix 
{
	public static void main(String[] args) 
	{
		int a1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int a2[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int sub[][]= new int[a1.length][a1[0].length];
		int mul[][]= new int[a1.length][a1[0].length];
		for (int i = 0; i < a2.length; i++) 
		{
			for (int j = 0; j < a2.length; j++) 
			{
				sub[i][j]=a1[i][j]-a2[i][j];
			}
		}
		System.out.println("Substraction: "+Arrays.deepToString(sub));
		for (int i = 0; i < a2.length; i++) 
		{
			for (int j = 0; j < a2.length; j++) 
			{
				mul[i][j]=a1[i][j]*a2[i][j];
			}
		}
		System.out.println("Multiplication: "+Arrays.deepToString(mul));
	}

}
