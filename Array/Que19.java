/*19. Write a Java program to add two matrices of
 the same size.*/
 import java.util.*;
 public class Que19
 {
	 public static void main(String[] args)
	 {
		int[][] arr1={{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr2={{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr3=SumOfMatrix(arr1,arr2);
		for(int i=0;i<arr3.length;i++)
		{
			for(int j=0;j<arr1[0].length;j++)
			{
				System.out.print(arr3[i][j]+"   ");
			}
			System.out.println();
		}
	 }
	 public static int[][] SumOfMatrix(int[][] arr1,int[][] arr2)
	 {
		int[][] arr3=new int[arr1.length][arr1[0].length];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[0].length;j++)
			{
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		return arr3;
	 }
 }
 