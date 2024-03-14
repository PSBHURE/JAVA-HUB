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
		int r=0,i=0,max=0,min=0;
		while(no>0)
		{
			r=no%10;
			list.add(r);
			no=no/10;
		}
		int[] arr=new int[list.size()];
		for(int X:list)
		{
			arr[i]=X;
			i++;
		}
		Arrays.sort(arr);
		for(int j=0;j<arr.length;j++)
		{
			min=min*10+arr[j];
		}
		for(int k=arr.length-1;k>=0;k--)
		{
			max=max*10+arr[k];
		}
		return max-min;
	}
}