import java.util.*;
public class Que3
{
	public static void main(String[] args)
	{
		System.out.println(Difference(132));
	}
	public static int Difference(int no)
	{
		List<Integer>list=new ArrayList<>();
		int r=0;
		while(no>0)
		{
			r=no%10;
			list.add(r);
			no=no/10;
		}
		int[] arr=new int[list.size()];
		int i=0;
		for(int X:list)
		{
			arr[i]=X;
			i++;
		}
		Arrays.sort(arr);
		int min=0;
		for(int m=0;m<arr.length;m++)
		{
			min=min*10+arr[m];
		}
		int temp=min;
		list.clear();
		while(temp>0)
		{
			r=temp%10;
			list.add(r);
			temp=temp/10;
		}
		int j=0;
		for(int X:list)
		{
			arr[j]=X;
			j++;
		}
		int max=0;
		for(int z=0;z<arr.length;z++)
		{
			max=max*10+arr[z];
		}
		return max-min;
	}
}