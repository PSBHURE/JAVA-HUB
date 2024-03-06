import java.util.Scanner;
public class ARRAYREVERSE
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int size=0;
		System.out.print("enter size of array:");
		size=sc.nextInt();
		int[] arr=new int[size];
			for(int i=0;i<size;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.print("Orignal Array:");
			for(int i=0;i<size;i++)
			{
			System.out.print(arr[i]+" ");
			}
			
			/*for(int i=0;i<size/2;i++)
			{
			temp=arr[i]+arr[size-1-i];
			arr[size-1-i]=temp-arr[size-1-i];
			arr[i]=temp-arr[i];
			}
			*/
			arr=ReverseArray(arr);
			System.out.println();
			System.out.print("Revers Array:");
			for(int i=0;i<size;i++)
			{
			System.out.print(arr[i]+" ");
			}
	}
	public static int[] ReverseArray(int[] arr)
	{
		int temp=0;
		for(int i=0;i<arr.length/2;i++)
			{
			temp=arr[i]+arr[arr.length-1-i];
			arr[arr.length-1-i]=temp-arr[arr.length-1-i];
			arr[i]=temp-arr[i];
			}
			return arr;
	}
}