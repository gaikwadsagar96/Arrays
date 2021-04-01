//Write a program to find sum of diagonal elements of a matrix
package com.hefshine.hw;

public class Q31_SumOfDigonal 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		int a[][]= {{1,2,3},
					{4,5,6},
					{7,8,9}};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				
				/*if(i==0&&j==0)
				{
					//System.out.print(a[i][j]);//sum+=a[i][j];
				}*/
				if(i+j==2)//3,5,7
					//System.out.print(a[i][j]);
					sum+=a[i][j]; //
				
				if(i==j)//1,5,9
					//System.out.print(a[i][j]);
					sum+=a[i][j];
			}
		}
		System.out.println("Sum:"+sum);

	}

}
