/*1. Write a program in C to store elements in an array and print
them.
Test Data :
Input 10 elements in the array :
element - 0 : 1
element - 1 : 1
element - 2 : 2
.......
Expected Output :
Elements in array are: 1 1 2 3 4 5 6 7 8 9*/
import java.util.Scanner;
public class Array1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("enter size of array");
		size=sc.nextInt();
	int[] arr=new int[size];
	for(int i=0;i<size;i++)
	{
		System.out.println("enter element of array::");
		arr[i]=sc.nextInt();
	}
	sc.close();
	for(int j=0;j<size;j++)
	{
		System.out.println(arr[j]);
	}

	}

}
