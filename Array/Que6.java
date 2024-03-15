//6. Write a Java program to find the index of an array element.
public class Que6
{
	public static void main(String[] args)
	{
	int[] arr={1,2,3,4,5,6,7,8,9,10};
	System.out.println(Exist(arr,8));
	System.out.println(Exist(arr,20));
	}
	public static int Exist(int[] arr,int no)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==no)
			{
			return i;
			}
		}
		return -1;
	}
}