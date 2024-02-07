//finding max and min element at list iteration
import java.util.Scanner;
public class MinMaxElement {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int i=0,j=0,size,max,min;
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
		System.out.println(6);
		if(size%2==0)
		{
		 if(arr[0]>arr[1])
			{max=arr[0];min=arr[1];}
		 else
			{max=arr[1];min=arr[0];}
		i=2;
		}
		else
		{min=arr[0];max=arr[0];i=1;}
		while(i<size-1)
		{
		 if(arr[i]>arr[i+1])
			{
				if(arr[i]>max) max=arr[i];
				if(arr[i+1]<min) min=arr[i+1];
			}
		else
			{
				if(arr[i+1]>max) max=arr[i+1];
				if(arr[i]<min) min=arr[i];
			}
			i+=2;
		}
		System.out.print("min="+min+" max="+max);
	}

}
