//4. Write a Java program to calculate the average value of array elements.
public class Que4
{
	public static void main(String[] args)
	{
	int[] arr={1,2,3,4,5,6,7,8,9,10};
	System.out.println(Average(arr));
	}
	public static double Average(int[] arr)
	{
		double sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum/arr.length;
	}
}