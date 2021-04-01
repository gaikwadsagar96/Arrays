package com.hefshine.cw;

public class Q02_BinarySearch 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		int key=2;
		Q02_BinarySearch bs=new Q02_BinarySearch();
		int result=bs.BinarySearchAlgo(a,key);
		if(result==-1)
		{
			System.out.println("Element not found");
		}
		else {
			System.out.println(key+" found at "+result+" position");
		}
	}

	int BinarySearchAlgo(int[] a, int key) 
	{
		//not working please see at project extra package preliumprepration 
		int left=0,right=a.length-1;
		while(left<=right);
		{
			int mid=(right+left)/2;
			if(a[mid]==key) {
				return mid;
			}
			if(a[mid]<key)
			{
				left=mid+1;
			}
			else
				right=mid-1;
		}
		return -1;
	}

}
