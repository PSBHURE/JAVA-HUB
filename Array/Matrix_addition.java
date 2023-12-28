package array;

import java.util.Scanner;

public class Matrix_addition {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter the size of row");
		int rows=sc.nextInt();
		System.out.println("enter the size of column");
		int cols=sc.nextInt();
		int arr1[][]=new int[rows][cols];
		int arr2[][]=new int[rows][cols];
		int arr3[][]=new int[rows][cols];
		System.out.println("enter elements in  1st matrix "+rows+"*"+cols+"matrix");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter elements in  2nd matrix "+rows+"*"+cols+"matrix");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println("addition of 2 matrix is");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}

	}

}
