/*Write a program or function to find saddle point of a matrix. Your program
should take input matrix from the user, display the matrix and find the saddle point
of that matrix. Saddle point of a matrix is an element in the matrix which is
smallest in its row and largest in its column. A matrix can have many or no saddle
points. For example,
6 3 1
9 7 8
2 4 5
In this matrix, 7 is the saddle point. Because it is the smallest in its row (2nd row)
and largest in its column (2nd column).*/
package com.hefshine.hw;

public class Q28_saddlePoint 
{

	public static void main(String[] args) 
	{
		/*int a[][]= {{6,3,1},
					{9,7,8},
					{2,4,5}};*/
		int a[][]= {{1,2,3},
				{4,5,6},
				{7,8,9}};
		saddlePoint(a);

	}

	private static void saddlePoint(int[][] a) 
	{
		int min,max,col,t=1;

		for (int i = 0; i < a.length; i++) 
		{
			min=a[i][0];
			col=0;
			//samallest in row
			for (int j = 0; j < a.length; j++) 
			{
				
				if(a[i][j]<min)
				{
					min=a[i][j];
					col=j;
				}
			}
			max=a[0][col];
			//largest in col
			for (int k = 0; k < a.length; k++) 
			{
				if(a[k][col]>max)
				{												//{6,3,1},
					max=a[k][col];								//{9,7,8},
				}												//{2,4,5}};
			}
			//System.out.println(max+" "+min);
			if(max==min) 
			{
				System.out.println("saddle number:"+max);
				t=0;
			}
		}
		if(t!=0)
			System.out.println("no saddle point");
		
	}

}
