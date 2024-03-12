import java.util.*;
public class CommanElementBewteenTwoArrays
{
	public static void main(String[] args)
	{
	int[] arr1={1,2,3,4,5,6,7,8,9,0};
	int[] arr2={4,6,8,0};
	int[] arr3=CommonElements(arr1,arr2);
	for(int i=0;i<arr3.length;i++)
	{
	 System.out.print(arr3[i]+" ");
	}
	
	}
	public static int[] CommonElements(int[] arr1,int[] arr2)
	{
		Set<Integer>set=new LinkedHashSet<>();
		//Set<Integer>set=new LinkedHashSet<>();
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					set.add(arr1[i]);
					break;
				}
			}
		}
		int[] arr3=new int[set.size()];
		int k=0;
		for(int no:set)
		{
			arr3[k++]=no;
		}
		return arr3;
	}
}