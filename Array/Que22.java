/*22. Write a Java program to find all pairs of 
elements in an array whose sum is equal to a 
specified number.*/
import java.util.*;
 public class Que22
 {
	 public static void main(String[] args)
	 {
		int[] arr={2,7,4,-5,11,5,20};
		String str=TwoSum(arr,15);
		System.out.print(str);
	 }	
	 public static String TwoSum(int[] arr,int target)
	 {
		Arrays.sort(arr);
		List<String>list=new ArrayList<>();
		int start=0,sum=0;
		int end=arr.length-1;
		while(start<end)
		{
			sum=arr[start]+arr[end];
			if(sum>target)
			end--;
			if(sum<target)
			start++;
			if(sum==target)
			{
				
				
				list.add(String.valueOf(arr[start])+(",")+(String.valueOf(arr[end])));
				end--;
				start++;
			}
		}
		String[] str=new String[list.size()];
		int i=0;
		for(String x:list)
		{
			str[i]=x;
			i++;
		}
		return String.join(":",str);
	 }
 }
 
