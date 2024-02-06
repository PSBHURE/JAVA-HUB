import java.util.Scanner;
public class MaxElementTillN {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,-4,5,9,8,10};
		System.out.println("enter value till index:");
		int n=sc.nextInt();
		int max=FindMaxTillIndexN(arr,n);
		System.out.println(max);
	}
	public static int FindMaxTillIndexN(int[] arr,int n)
	{
		int max=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			max=arr[i];
		}
		return max;
	}
}
