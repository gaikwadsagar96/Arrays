/*Given 2 character arrays s1 and s2 and another empty character array s3.
Populate s3 by interleaving characters from both s1 and s1(Mindstix)
Method signature
Void interleaved (char[] s1, char[]s2, char[]s1, int s1_len, int s2_len)
{
// Your Code
}
Example:
test case 1:
S1={‘a’,’b’,’c’,’d’};
S2={‘w’,’x’,’y’,’z’};
Output:
S3={‘a’,’w’’b’,’x’’c’,’y’,’d’,’z’}.
testcase 2:
S1={‘a’,’b’,’c’,’d’,'e','f','g'};
S2={‘w’,’x’,’y’,’z’};
o/p s3={ ‘a’,’w’’b’,’x’’c’,’y’,’d’,’z’,'e','f','g'}
test case 3
S1={‘a’,’b’,’c’,’d’};
S2={‘w’,’x’,’y’,’z’,'e','f','g'};
o/p s3={ ‘a’,’w’’b’,’x’’c’,’y’,’d’,’z’,'e','f','g'}
*/
package com.hefshine.hw;

import java.util.Arrays;

public class Q27_InterleavingCharacter 
{

	public static void main(String[] args) 
	{
		char s1[]= {'a','b','c','d','e'};
		char s2[]= {'w','x','y','z','f','g','h'};
		int s1_len=s1.length;
		int s2_len=s2.length;
		interleaved(s1,s2,s1_len,s2_len);
	}

	private static void interleaved(char[] s1, char[] s2, int s1_len, int s2_len) 
	{
		char s3[]=new char[s1.length+s2.length];
		int ind1=0,ind2=0;
		int t=s1.length-s2.length-1;
		for (int i = 0; i < s3.length; i++) 
		{
			if(ind1<s1.length)
			{
				s3[i]=s1[ind1++];
				if(ind1<s1.length-t)
					i++;
				else if(ind2<s2.length-t)
					i++;
			}
			if(ind2<s2.length)
			{
				s3[i]=s2[ind2++];
			}
		}
		System.out.print(Arrays.toString(s3));
/*		char s3[]=new char[s1_len+s2_len];
		for(int i=0,j=0,k=0;i<s3.length;i++)
		{
			int t=1;
			if(i%2==0)
			{
				s3[i]=s1[j];
				j++;
			}
			else {
				s3[i]=s2[k];
				k++;
			}
		}
		System.out.println(Arrays.toString(s3));
*/		
	}

}
