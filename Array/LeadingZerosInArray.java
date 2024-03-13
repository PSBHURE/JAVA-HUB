import java.util.*;
public class LeadingZerosInArray
{
	public static void main(String[] args)
	{
		int[] arr={1, 0 ,20, 0 ,10, 89, 100, 0 ,11, 0, 22,};
		int[] arr1=ArrangeZerosAtBegin(arr);
		for(int X:arr1)
		{
		System.out.print(X+" ");
		}
	}
	public static int[] ArrangeZerosAtBegin(int[] arr)
	{
		
		int left=0;
		int right=0;
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==0 && arr[j]!=0)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					break;
				}
			}
		}
		return arr;
	}
}

	/*int left=0,right=0,temp=0;
		while(right<arr.length)
		{
			if(arr[right]!=0)
			{
			  temp=arr[left];
			  arr[left]=arr[right];
			  arr[right]=temp;
			  left++;
			}
			right++;
		}*/
