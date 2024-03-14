import java.util.*;
public class ExamCode6
{
	public static void main(String[] args)
	{
		String str="Worls is a beautiful place";
		System.out.println(str);
		System.out.println(StringManipulation(str));
	}
	public static String StringManipulation(String str)
	{
		char[] arr=str.toCharArray();
		List<Integer>list=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==' ')
			list.add(i);
		}
		int left=0,right=arr.length-1;
		char ch='\0';
		while(left<right)
		{
			if(list.contains(left))
			{
				arr[left]=' ';
				left++;
			}
			if(list.contains(right))
			{
				arr[right]=' ';
				right--;
			}
			else
			{
				ch=arr[left];
				arr[left]=arr[right];
				arr[right]=ch;
				left++;
				right--;
			}
		}
		return String.valueOf(arr);
	}
}