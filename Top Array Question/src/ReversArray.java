import java.util.Scanner;

public class ReversArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0,j=0,size;
		System.out.print("enter size of an array:");
		size=sc.nextInt();
		int arr[]=new int[size];
		for(i=0;i<size;i++)
		{
			System.out.print("enter "+(i+1)+"st element:");
			arr[i]=sc.nextInt();
		}
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		int start=0;
		int end=size-1;
		int temp;
		while(start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		System.out.println();
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
