/*
3. Write a program in C to find the sum of all elements of the array.
Test Data : 
 */
import java.util.Scanner;
public class Array3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array::");
		int size=sc.nextInt();
		int sum=0;
		int[] arr=new int[size];
		System.out.println("enter "+size+" elements in array::");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		for(int j=0;j<size;j++)
		{
			sum=sum+arr[j];
		}
		System.out.println("sum="+sum);
	}

}
