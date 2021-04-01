//Write a program to create an array of its anti-diagonals from a given square matrix.

package com.hefshine.hw;

import java.util.Arrays;

public class Q12_AntiDigonalArray 
{	

	public static void main(String[] args) 					//1 2 3
	{														//4 5 6
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};				//7 8 9
		//System.out.println(Arrays.deepToString(a));
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		rotate(a);
		
	}

	private static void rotate(int[][] matrix) 
	{
		int temp=0;
		//flip values against anti digonal
		for (int col = 0; col < matrix.length-1; col++) 
		{
			for (int row = 0; row < matrix.length-1-col; row++)
			{
				temp=matrix[row][col];
				matrix[row][col]=matrix[matrix.length-1-col][matrix.length-1-row];
				matrix[matrix.length-1-col][matrix.length-1-row]=temp;
			}
		}
			//flip values column wise
		for (int col = 0; col < matrix.length; col++) 
			{
				for (int row = 0; row < matrix.length/2; row++) 
				{
					temp=matrix[row][col];
					matrix[row][col]=matrix[matrix.length-1-row][col];
					matrix[matrix.length-1-row][col]=temp;
				}
			}
		for (int i = 0; i < matrix.length; i++) 
		{
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
