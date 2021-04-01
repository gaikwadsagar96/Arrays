// Write a program to display outer elements of a matrix. i.e 2d array of size 6 x 6.
package com.hefshine.hw;

public class Q23_DisplayOterElements 
{

	public static void main(String[] args) 
	{
		int a[][]= {{1,1,1,1,1,6},
					{1,2,3,4,5,6},
					{1,2,3,4,5,6},
					{1,2,3,4,5,6},
					{1,2,3,4,5,6},
					{6,6,6,6,6,6}};
					
		for (int i = 0; i < a.length; i++) 
		{
			/*int imin=0;
			int imax=a.length;
			int jmin=0;
			int jmax=a[0].length;
			for (int j = 0; j < a[0].length; j++) 
			{
				if(i==imin && jmax>=0)
				System.out.print(a[i][j]+" ");
				imin++;
				if(imin>=0&& )
			}*/
			for (int j = 0; j < a[0].length; j++) 
			{
				if(i==0||i==a.length-1||j==0||j==a[0].length-1)
				{
					System.out.print(a[i][j]+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
			
		}

	}

}
