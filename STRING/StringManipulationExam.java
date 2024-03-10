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
		char base='\0';
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]>='a'&&arr[i]<='z')||(arr[i]>='A'&&arr[i]<='Z'))
			{
				base=Character.isLowerCase(arr[i])?'a':'A';
				arr[i]=(char)(base+(arr[i]-base+shift)%26);
			}
		}
		return String.valueOf(arr);
	}
}