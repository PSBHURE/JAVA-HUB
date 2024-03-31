//C++ String: Exercises, Practice, Solution
/*14. Write a C++ program to find the numbers in a given string and calculate the sum of all numbers.
Example:
Sample Input: w3resource from 2008
Sample Output: Sum of the numbers: 2011*/

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
		char[] arr=s.toCharArray();
		StringBuffer temp=new StringBuffer();
		List<String> list=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			char ch1=arr[i];
			if(Character.isDigit(ch1))
			{temp.append(ch1);
			while(i+1<arr.length && Character.isDigit(arr[i+1]))
			{
				temp.append(arr[i+1]);
				i++;
			}
			list.add(temp.toString());
			temp.setLength(0);}
		}
		int sum=0;
		for(String x:list)
		{
			sum=sum+Integer.parseInt(x);
		}
		return sum;
	}
}

/*import java.util.*;

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
}*/
