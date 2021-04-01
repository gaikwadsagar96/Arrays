/*Write a program to rotate an array to the left
i/p
1 2 3 5 
4 5 6 8 
7 8 9 3
11 22 33 44

o/p
11 7 4 1 
22 8 5 2 
33 9 6 3 
44 3 8 5 
*/
package com.hefshine.hw;

public class Q24_RotateLeft 
{
	
	public static void main(String[] args) 
	{
		int a[][]= {{1,2,3,5}, 
				{4,5,6,8}, 
				{7,8,9,3},
				{11,22,33,44}};
		rotate(a);

	}

	private static void rotate(int[][] a) 
	{
		int row=a.length;
		//display
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		//transpose;
		for (int i = 0; i < row; i++) 
		{
			for (int j = i; j < row; j++) 
			{
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		//reverce each row
		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < row/2; j++) 
			{
				int temp=a[i][j];
				a[i][j]=a[i][row-1-j];
				a[i][row-1-j]=temp;
			}
		}
		System.out.println();
		//display
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
