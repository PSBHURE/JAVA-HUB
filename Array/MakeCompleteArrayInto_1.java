package array;

import java.util.Arrays;
import java.util.Scanner;

public class MakeCompleteArrayInto_1 {

	public static void main(String[] args) {
		int[] arr;
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		size=sc.nextInt();
		arr=new int[size];
		System.out.println("enter "+size+" elements in array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int max=arr[arr.length-1];
		int k=0;
		while(k<max) {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>1)
				arr[i]=arr[i]-1;
		}
		k++;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
	

}
