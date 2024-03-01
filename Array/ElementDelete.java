import java.util.Scanner;
public class ElementDelete
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int size=0,position=0,value=0;
		
		System.out.print("enter size of array:");
		size=sc.nextInt();
		int[] arr=new int[size];
		System.out.print("enter "+(size) +" elements of array:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("enter position from where you want to delete element:");
		position=sc.nextInt();
		for(int i=position;i<size;i++)
		{
			arr[i-1]=arr[i];
		}
		for(int i=0;i<size-1;i++)
		{
		System.out.print(arr[i]+" ");
		}
	}
}