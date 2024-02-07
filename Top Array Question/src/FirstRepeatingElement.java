import java.util.*;

public class FirstRepeatingElement {

	private static final int ArrayList = 0;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int arr[]={0,1,2,3,4,5,6,6,3,4,5,6,10};
		firstRepeatingElement(arr);
	}
	public static void firstRepeatingElement(int[] arr)
	{
		List<Integer>list=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			for(int j:list)
			{
				if(arr[i]==j)
					{System.out.println(arr[i]);
					break;
					}
				else
					list.add(arr[i]);
			}
		}
	}

}
