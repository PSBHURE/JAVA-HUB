//Write a Java program to sum values of an array.
public class Que2
{
	public static void main(String[] args)
	{
	int[] arr={1,2,3,4,5,6,7,8,9,10};
	System.out.println(Addition(arr));
	}
	public static int Addition(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}
}