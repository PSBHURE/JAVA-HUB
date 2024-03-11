/*In a given string convert all vowels into upper case*/
public class UpperCaseVowel
{
	public static void main(String[] str)
	{
	  System.out.print(UPPERCASEVOWEL("w3resource"));
	}
	public static String UPPERCASEVOWEL(String str)
	{
	  char[] arr=str.toCharArray();
	  for(int i=0;i<arr.length;i++)
	  {
		if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
		arr[i]=(char)(arr[i]-32);
	  }
	  return String.valueOf(arr);
	}
}