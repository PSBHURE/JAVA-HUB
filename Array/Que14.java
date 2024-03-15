//14. Write a Java program to find common elements between two arrays (string values).
import java.util.*;
public class Que14
{
	public static void main(String[] args)
	{
		String[] arr1={"abc","pqr","xyz","lmn","opq"};
		String[] arr2={"lmn","abd","pqr","cdc"};
		String[] arr3=CommonElement(arr1,arr2);
		for(int i=0;i<arr3.length;i++)
		{
		System.out.print(arr3[i]+" ");
		}
	}
	public static String[] CommonElement(String[] arr1,String[] arr2)
	{
		List<String>list=new ArrayList<>();
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i].equals(arr2[j]))
				list.add(arr1[i]);
			}
		}
		String[] arr3=new String[list.size()];
		for(int j=0;j<list.size();j++)
		{
			arr3[j]=list.get(j);
		}
		return arr3;
	}
}