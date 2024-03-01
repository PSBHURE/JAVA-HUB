import java.util.Scanner;
public class ArrayShift
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int size=0,position=0,value=0;
		
		System.out.print("enter size of array:");
		size=sc.nextInt();
		int[] arr=new int[size];
		System.out.print("enter "+(size-1) +" elements of array:");
		for(int i=0;i<size-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("enter position where you want to add new element:");
		position=sc.nextInt();
		for(int i=size-1;i>position;i--)
		{
			arr[i]=arr[i-1];
		}
		System.out.print("enter new value at "+position+" position:");
		value=sc.nextInt();
		arr[position]=value;
		for(int i=0;i<size;i++)
		{
		System.out.print(arr[i]+" ");
		}
	}
}