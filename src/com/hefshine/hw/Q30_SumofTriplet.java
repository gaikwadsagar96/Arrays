/*Write a program to find out count of triplets with sum smaller than given 
sum value.
Examples:
Array=[5,1,3,4,7
] S=12.
Output :4
Explaination: Below are triplets with sum less than 12
(1,3,4),(1,3,5),(1,3,7),(1,4,5)*/
package com.hefshine.hw;

public class Q30_SumofTriplet 
{
	public static void main(String[] args) 
	{
		int a[]= {5,1,3,4,7};
		int s=12;
		int cnt=0;
		for (int i = 0; i < a.length; i++) 
		{
			
			for (int j = i+1; j < a.length; j++) 
			{
				for (int k = j+1; k < a.length; k++) 
				{
					
					if(a[i]+a[j]+a[k]<s)
					{
						
						System.out.println("("+a[i]+","+a[j]+","+a[k]+") sum="+(a[i]+a[j]+a[k]));
						cnt++;
					}
							
				}
			}
			
		}
		System.out.println("Number of triplet: "+cnt);
	}
}
