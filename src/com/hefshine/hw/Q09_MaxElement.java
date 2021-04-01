/*Write a program to find maximum element in a matrix.
o/p

1 2 3 
4 5 6 
7 8 9 
Maximum element in matrix:9*/
package com.hefshine.hw;import java.util.Arrays;

public class Q09_MaxElement 
{
	static int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	public static void main(String[] args) 
	{
		int max=a[0][0];
		//print array
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	
	//find max element
	for (int i = 0; i < a.length; i++) 
	{
		for (int j = 0; j < a.length; j++) 
		{
			if(a[i][j]>max)
			{
				max=a[i][j];
			}
		}
	
	}
	System.out.println("Maximum element in matrix:"+max);
	}
}
