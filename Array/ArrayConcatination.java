//Write a program in C to merge two arrays of the same size sorted in descending order.
package array;
import java.util.Scanner;
public class ArrayConcatination {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size,i,j,temp;
		int[] arr1;
		int[] arr2;
		
		System.out.println("enter size of array");
		size=sc.nextInt();
		arr1=new int[size];
		arr2=new int[size];
		int[] arr3=new int [2*size];
		System.out.println("enter "+size+" elements in arr1:");
		for(i=0;i<size;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("enter "+size+" elements in arr2:");
		for(i=0;i<size;i++)
		{
			arr2[i]=sc.nextInt();
		}
		for(i=0;i<size;i++)
		{
			arr3[i]=arr1[i];
		}
		for(i=size;i<size*2;i++)
		{
			arr3[i]=arr2[i-size];
		}
		System.out.println("concatinated sorted array=>");
		for(i=0;i<size*2;i++)
		{
			System.out.print(arr3[i]+" ");
		}
		for(i=0;i<2*size-1;i++)
		{
			for(j=0;j<2*size-i-1;j++)
			{
				if(arr3[j]<arr3[j+1])
				{
					temp=arr3[i];
					arr3[j]=arr3[j+1];
					arr3[j+1]=temp;
				}
			}
		}
		/*
		   for(i=0;i<s3; i++)
        {
           for(k=0;k<s3-1;k++)
             {
         
                if(arr3[k]<=arr3[k+1])
                 {
                   j=arr3[k+1];
                   arr3[k+1]=arr3[k];
                   arr3[k]=j;
                 }  
              }
         } 
		 */
		System.out.println();
		for(i=0;i<size*2;i++)
		{
			System.out.print(arr3[i]+" ");
		}
	}

}
