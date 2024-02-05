import java.util.HashSet;
import java.util.Set;
public class OddNoTerms
{
	public static void main(String[] args)
	{
	 int arr[]={8,3,8,5,4,3,4,3,5,5,7};
	 Set<Integer>x=showOddTerms(arr);
	 for(int z:x)
	 {
		 System.out.print(z+" ");
	 }
	}
	public static Set<Integer> showOddTerms(int[] arr)
	{
	 Set<Integer>list=new HashSet<>();
		
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
		 for(int j=0;j<arr.length;j++)
		 {
			 if(i==j)
				 continue;
			if(arr[i]==arr[j])
			count++;
		 }
		 if(count%2!=0)
		 {
			 list.add(arr[i]);
		 }
		 
		}
		return list;
	}
}
