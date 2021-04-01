//Write a program to remove a specific element from an array

package com.hefshine.hw;
import java.util.*;
public class Q03_RemoveSpecificElement {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		Q03_RemoveSpecificElement r=new Q03_RemoveSpecificElement();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int a[]= {9,3,5,7,8,3,2,6};
		
		System.out.println(Arrays.toString(a));
	
		System.out.println("Enter index of element to delete: ");
		int index=sc.nextInt();
		
		a=r.remove(a,index);
		System.out.println("araay after remove element\n"+Arrays.toString(a));
	}

	private int[] remove(int[] a, int index) 
	{
		int a1[]=new int[a.length-1];
		for (int i = 0,k=0; i < a.length; i++) 
		{
			if(i==index) //if index is removal of element
				continue;//if index is not removal element index
			a1[k++]=a[i];//else fill the array
		}
		return a1;
	}

}
