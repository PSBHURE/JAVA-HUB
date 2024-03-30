//C++ String: Exercises, Practice, Solution
/*14. Write a C++ program to find the numbers in a given string and calculate the sum of all numbers.
Example:
Sample Input: w3resource from 2008
Sample Output: Sum of the numbers: 2011*/
/*
import java.util.*;
public class CppQue14
{
	public static void main(String[] args)
	{
		String s="w3resource from 2008";
		System.out.print(check(s));
	}
	public static int check(String s)
	{
		List<String>list=new ArrayList<>();
		char[] arr=s.toCharArray();
		StringBuffer temp=new StringBuffer();
		for(int i=0;i<arr.length;i++)
		{
			int j=i+1;
			while((arr[i]>=48 && arr[i]<=57)&&(arr[j]>=48 && arr[j]<=57))
			{
				temp.append(arr[i]);
				if(i<arr.length-1)
				i++;
			else
				break;
				
			}
			list.add(new String(temp));
			temp.delete(0,temp.length());
			if((arr[i]>=48 && arr[i]<=57)&&(arr[j]<48 || arr[j]>57))
			{
	
				temp.append(arr[i]);
			}
			list.add(new String(temp));
			temp.delete(0,temp.length());
		}
		int sum=0;
		for(String ch:list)
		{
			sum+=Integer.parseInt(ch);
		}
		return sum;	
	}
}*/

import java.util.*;

public class CppQue14 {
    public static void main(String[] args) {
        String s = "w3resource from 2008";
        System.out.print(check(s));
    }

    public static int check(String s) {
        List<String> list = new ArrayList<>();
        char[] arr = s.toCharArray();
        StringBuilder temp = new StringBuilder();
        
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) {
                temp.append(arr[i]);
                while (i + 1 < arr.length && Character.isDigit(arr[i + 1])) {
                    temp.append(arr[i + 1]);
                    i++;
                }
                list.add(temp.toString());
                temp.setLength(0);
            }
        }

        int sum = 0;
        for (String num : list) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
