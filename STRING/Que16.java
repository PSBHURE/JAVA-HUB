/*longest common prifix of string*/
import java.util.*;
public class Que16
{
	public static void main(String[] args)
	{
		String[] arr={"remember","remove","rena","renuka","recognize","remote"};
		System.out.println(check(arr));
	}
	public static String check(String[] arr)
	{
		Arrays.sort(arr);
		String s1=arr[0];
		String s2=arr[arr.length-1];
		int max;
		if(s1.length()>s2.length())
		max=s1.length();
		else
		max=s2.length();
		StringBuffer temp=new StringBuffer();
		for(int i=0;i<max;i++)
		{
			if(s1.charAt(i)==s2.charAt(i))
			temp.append(s1.charAt(i));
			else
			break;
		}
		if(temp.length()==0)
			return "there is no common prefix";
		return new String(temp);
	}
}