/*Write a program calculate the average of the inner elements of an array 
1 2 3,4 
4 5 6,4 
7 8 9,4*/
package com.hefshine.hw;

public class Q20_AverageOfInnerElement 
{

	public static void main(String[] args) 
	{
		int a[][]= {{1,2,3,4,6},{4,5,6,4,6},{7,8,9,4,6},{1,2,3,4,5}};
		float sum=0,avg,cnt=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[0].length; j++) 
			{
				if(i!=0 && j!=0 && i!=a.length-1 && j!=a[0].length-1)
				{
					sum+=a[i][j];
					cnt++;
					System.out.print(a[i][j]+" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		System.out.println("\nsum:"+sum+" Average: "+(sum/cnt));
		
	}

}
