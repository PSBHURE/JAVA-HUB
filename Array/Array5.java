/*Write a program in C to count the total number of duplicate 
elements in an array.*/
import java.util.Scanner;
public class Array5 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int i,j,count=0,size;
	System.out.print("enter size of array=");
	size=sc.nextInt();
	int[] arr=new int[size];
	System.out.println("enter "+size+" elements");
	for(i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(i=0;i<size;i++)
	{
		for(j=i+1;j<size;j++)
		{
			if(arr[i]==arr[j])
			{
				count++;
				break;
			}
		}
	}
	System.out.println("no of duplicate elements="+count);
	}

}