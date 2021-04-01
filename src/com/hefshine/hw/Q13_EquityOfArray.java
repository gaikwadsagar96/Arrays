//Write a program to test the equality of two arrays

package com.hefshine.hw;

public class Q13_EquityOfArray 
{

	public static void main(String[] args) 
	{
		int a1[]= {1,2,3,4,5,6,7,8,9};
		int a2[]= {1,2,3,4,5,6,7,8,9};
		boolean same=false;
		if(a1.length==a2.length)
		{
			for (int i = 0; i < a2.length; i++) 
			{
				if(a1[i]==a2[i])
				{
					same=true;
					continue;
				}
				else {
					same=false;
					System.out.println("not same");
					break;
				}
			}
		}
		if(same==true)
			System.out.println("Array are same");
	}

}
