//Write a program to find the second largest element in an array
//o/pSecond large Number: 8
package com.hefshine.hw;

public class Q08_SecondLargestNumber 
{

	public static void main(String[] args) 
	{
		int a[]= {1,9,2,4,8,5,6,8,3};
		int largeNumber=a[0];
		int secondln=a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>secondln)
			{
				secondln=a[i];
				if(secondln>largeNumber)
				{
					int temp=largeNumber;
					largeNumber=secondln;
					secondln=temp;
				}
			}
		}
		System.out.println("Second large Number: "+secondln);

	}

}
