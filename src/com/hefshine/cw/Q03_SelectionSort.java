// Write a program sort array elements in using selection sort. 
package com.hefshine.cw;

public class Q03_SelectionSort 
{
	public static void main(String[] args) 
	{
		int a[]= {4,7,1,9,3,6,2,5,8};
		Q03_SelectionSort ss=new Q03_SelectionSort();
		ss.selectionSortAlgo(a);

	}

	private void selectionSortAlgo(int[] a) 
	{
		for(int i=0;i<a.length;i++)
		{
			int min_inx=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min_inx])
					min_inx=j;
			}
			int temp=a[min_inx];
			a[min_inx]=a[i];
			a[i]=temp;
		}
		
		for(int x:a)
			System.out.print(x+" ");
		
	}

}
