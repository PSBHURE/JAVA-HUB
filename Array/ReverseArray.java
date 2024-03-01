import java.util.Scanner;
public class ReverseArray{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
			int size=0;
			System.out.print("enter the size of array=");
			size=sc.nextInt();
			int[] arr=new int[size];
			int[] stack=new int[size];
			int top=-1;
			System.out.print("enter "+size+" elements in array:");
			for(int i=0;i<size;i++)
			{
			 arr[i]=sc.nextInt();
			}
			System.out.print("your normal array:");
			for(int i=0;i<size;i++)
			{
				System.out.print(arr[i]+" ");
			}
			for(int i=0;i<size;i++)
			{
				if(top==size)
				{
				break;
				}
				++top;
				stack[top]=arr[i];
			}
			for(int i=0;i<size;i++)
			{
				arr[i]=stack[top];
				if(top==-1)
				{
					break;
				}
				top--;
			}
			System.out.print("\n revers array is:");
			for(int i=0;i<size;i++)
			{
			System.out.print(arr[i]+" ");
			}
		sc.close();
	}
}