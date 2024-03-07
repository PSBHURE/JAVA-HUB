public class DigitCounting
{
	public static void main(String[] args)
	{
		String str="Welcome to w3resource.com";
		int[] count=Counting(str);
		System.out.println("CHARACTER="+count[0]);
		System.out.println("NUMBER="+count[1]);
		System.out.println("SPECIAL_CHARACTER="+count[2]);
	}
	public static int[] Counting(String str)
	{
		char[] arr=str.toCharArray();
		int[] arr1=new int[3];
		int CHARACTER=0,NUMBER=0,SPECIAL_CHARACTER=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if((arr[i]>='A' && arr[i]<='Z')||(arr[i]>='a'&& arr[i]<='z'))
			CHARACTER++;
			
			if(arr[i]>='0' && arr[i]<='9')
			NUMBER++;
			
			else
			SPECIAL_CHARACTER++;
			
		}
		arr1[0]=CHARACTER;
		arr1[1]=NUMBER;
		arr1[2]=SPECIAL_CHARACTER;
		return arr1;
	}
	
}