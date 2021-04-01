//transpose of matrix jugad
package com.hefshine.cw;

import java.util.Arrays;

public class Q06_TransposeOfMatrix 
{
	public static void main(String[] args)
	{
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int a1[][] = new int[a.length][a[0].length];
		//transpose
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++)
			{
				a1[i][j]=a[j][i];
			}
		}
		System.out.println(Arrays.deepToString(a1));
		
		for (int i = 0; i < a1.length; i++) 
		{
			for (int j = 0; j < a1.length; j++)
			{
				System.out.print(a1[i][j]);
			}
			System.out.println();
		}
	}
}
