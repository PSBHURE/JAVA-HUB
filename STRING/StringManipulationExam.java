public class StringManipulationExam
{
	public static void main(String[] args)
	{
		String str="abcd xyz";
		System.out.print(Modify(str,4));
	
	}
	public static String Modify(String str,int shift)
	{
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
		 arr[i]=arr[i]+shift;
		}
		return String.valueOf(arr);
	}
}