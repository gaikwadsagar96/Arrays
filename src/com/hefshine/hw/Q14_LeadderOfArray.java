/*Write a program to print all the LEADERS in the array.
Note: An element is leader if it is greater than all the elements to its right side*/
package com.hefshine.hw;

public class Q14_LeadderOfArray 
{

	public static void main(String[] args) 
	{
		int a[]= {1,9,2,3,6,5,4};
		
		for (int i = 0; i < a.length; i++) 
		{
			boolean t=false;
			for (int j = 1; j < a.length; j++) 
			{
				int leader=a[i];
				if(a[i]>a[j]) 
				{
					t=true;
				}
				else 
				{
					t=false;
				}
			
			}
			if(t==true)
				System.out.print(a[i]+" ");		
		}
	}
}
