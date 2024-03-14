public class Que2
{
	public static void main(String[] args)
	{
		String str="abcd xyz";
		System.out.println(Manipulation(str,4));
	}
	public static String Manipulation(String str,int shift)
	{
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			char base=Character.isLowerCase(arr[i])?'a':'A';
			if(arr[i]==' ')
			continue;
			else
			arr[i]=(char)(base+(arr[i]-base+shift)%26);
		}
		return String.valueOf(arr);
	}
}