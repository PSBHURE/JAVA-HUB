import java.util.Scanner;
public class MaxElementTillN {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,-4,5,9,8,10};
		System.out.println("enter value till index:");
		System.out.println();
		int max=FindMaxTillIndexN(arr);
		System.out.println();
		System.out.println(max);
	}
	public static int FindMaxTillIndexN(int[] arr)
	{
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			max=arr[i];
			System.out.print(max+" ");
		}
		return max;
	}
}
