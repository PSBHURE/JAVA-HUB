/*
2. Write a program in C to read n number of values in an array and display them in reverse order.
Test Data :
Input the number of elements to store in the array :3
Input 3 number of elements in the array :
element - 0 : 2
element - 1 : 5
element - 2 : 7*/
import java.util.Scanner;
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter element::");
			arr[i]=sc.nextInt();
		}
		sc.close();
		for(int j=size-1;j>=0;j--)
		{
			System.out.println(arr[j]);
		}
		

	}

}
