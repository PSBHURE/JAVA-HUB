package array;
import java.util.Scanner;
public class LargestElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size of array:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		int i,max=0;
		System.out.println("enter "+size+" elements");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<size;i++)
		{
			if(i==0)
			max=arr[i];
			else
			{
				if(arr[i]>max)
					max=arr[i];
			}
		}
		System.out.println("max="+max);
	}

}
