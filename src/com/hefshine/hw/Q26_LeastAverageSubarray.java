/*Given an integer array and size of subarray,find the first subarray with leasts
average in single loop. Print first index of subarray and average. (Mindstix)
Method signature Find Firstsub(int arr[], int arr_len, int sub_arr_len)
33 | P a g e
{
//Your code
}
Example:
Input:
int arr={3,7,90,20,5,50,40}, k=3
Find Firstsub(arr,7
Output:
Index:3 Avg:25*/
package com.hefshine.hw;

public class Q26_LeastAverageSubarray 
{
	static int a[]={3,7,90,20,5,50,40};
	public static void main(String[] args) 
	{
		int min=Integer.MAX_VALUE;
		int k=3;
		for (int i = 0; i < a.length-k+1; i++) 
		{
			int avg=sum(i,k,0)/k;
			if(min>avg)
				min=avg;
		}
		System.out.println(min);
	}

	private static int sum(int i, int k, int j) 
	{
		if(j<k)
			return a[i]+sum(i+1,k,j+1);
		else
			return 0;
	}

}
