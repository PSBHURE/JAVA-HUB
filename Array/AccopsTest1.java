import java.util.*;
public class AccopsTest1
{
	public static void main(String[] args)
	{
		System.out.print(AddAndSub(231));
	}
	public static int AddAndSub(int no)
	{
	  int[] arr=new int[String.valueOf(no).length()];
	  int temp=no,r=0,i=0,min=0,max=0;
	  while(no>0)
	  {
		  r=no%10;
		  no=no/10;
		  arr[i]=r;
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