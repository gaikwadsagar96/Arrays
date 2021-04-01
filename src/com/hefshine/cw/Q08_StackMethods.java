package com.hefshine.cw;

import java.util.Scanner;

public class Q08_StackMethods 
{
	static Scanner sc=new Scanner(System.in);
	static int top=-1;
	int stack[]=new int[10];
	public static void main(String[] args) 
	{
		Q08_StackMethods sm=new Q08_StackMethods();
		while(true)
		{
			System.out.println("1.isfull\n2.isEmpty\n3.push\n4.Pop\n5.Exit");
			int key=sc.nextInt();
			switch (key) {
			case 1:
				sm.isFull();
				break;
			case 2:
				sm.isEmpty();
				break;
			case 3:
				sm.Push();
				break;
			case 4:
				sm.Pop();
				break;
			case 5:
				System.exit(4);
				break;

			default:
				System.out.println("please enter valid number");
				break;
			}
		}
	}
	private void Pop() 
	{
		if(top==-1)
			System.out.println("Stack is empty");
		else {
			System.out.println(stack[top]+" is poped");
			stack[top]=0;
			top--;
		}
		
	}
	private void isFull() 
	{
		if(top==stack.length-1);
			System.out.println("Stack is full");
	}
	private void Push() 
	{
		if(top==stack.length)
			System.out.println("Stack is full");
		else {
			top++;
			System.out.println("Enter value");
			int v=sc.nextInt();
			stack[top]=v;
			System.out.println(v+" is pushed");
		}
	}
	private void isEmpty() 
	{
		if(top==-1)
			System.out.println("Stack is empty");
		
	}

}
