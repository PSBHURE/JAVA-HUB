public class CharacterCounter
{
	public static void main(String[] args)
	{
		String str="Welcome to w3resource.com";
		int[] arr=countVowel(str);
		
			System.out.println("no of vowel="+arr[0]);
			
			System.out.println("no of consonant="+arr[1]);
		
	}
	public static int[] countVowel(String str)
	{
		char[] arr=str.toCharArray();
		int vowel=0,consonant=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U')
			vowel++;
			else if((arr[i]>='a' && arr[i]<='z')||(arr[i]>='A'&&arr[i]<='Z'))
			consonant++;
		}
		int[] arr1=new int[2];
		arr1[0]=vowel;
		arr1[1]=consonant;
		return arr1;
	}
}