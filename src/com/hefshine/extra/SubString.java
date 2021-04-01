package com.hefshine.extra;

import java.util.Arrays;

public class SubString 
{
	public static void main(String[] args) 
	{
		String s="abcPxyzPjkl";
		char ch='P';
		int cnt=1;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)==ch)
				cnt++;
		}
		String sa[]=new String[cnt];
		int si=0;
		int ei=0;
		int salen=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)==ch||i==s.length()-1)	//if char found
			{
				ei=i-1;
				if(i==s.length()-1)					//for last word
					ei=i;
				char cha[]=new char[ei-si+1];		//create char array to store sub string
				int chalen=0;						//initial length of substring
				for(int j=si;j<=ei;j++)				//loop to store substring
				{
					cha[chalen++]=s.charAt(j);
				}
				String subString=new String(cha);	//convert  sub array into string
				sa[salen++]=subString;				//place sub string into string array also increment String array index
				si=i+1;					
			}
		}
		System.out.println(Arrays.toString(sa));
	}
}
