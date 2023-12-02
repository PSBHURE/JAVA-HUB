/*Write a program in C to copy the elements of one array into
another array*/
import java.util.Scanner;
public class Array4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size,i,j;
		System.out.println("enter size of array");
		size=sc.nextInt();
		int[] arr1=new int[size];
		System.out.println("enter "+size+" elements in array::");
		for(i=0;i<size;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.print("elements of arr1::");
		for(i=0;i<size;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		int[] arr2=new int[size];
		for(j=0;j<size;j++)
		{
			arr2[j]=arr1[j];
		}
		System.out.println();
		System.out.print("elements of arr2::");
		for(j=0;j<size;j++)
		{
			System.out.print(arr2[j]+" ");
		}
		
	}

}
