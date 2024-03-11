import java.util.*;
public class RemoveSpacesFromSentence
{
	public static void main(String[] args)
	{
		System.out.print(RemoveSpace("The quick brown fox jumps over the lazy dog"));
	}
	public static String RemoveSpace(String str)
	{
	char[] arr=str.toCharArray();
	 List<Character>list=new ArrayList<>();
	 for(int i=0;i<arr.length;i++)
	 {
		if(arr[i]!=' ')
		list.add(arr[i]);
	 }
	 char[] arr1=new char[list.size()];
	 for(int j=0;j<list.size();j++)
	 {
		 arr1[j]=list.get(j);
	 }
	 return String.valueOf(arr1);
	}
}