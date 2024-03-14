public class Que4
{
	public static void main(String[] args)
	{
		String str="0 1 0 20 30 0 89 0 100";
		System.out.println(LeadingZeros(str));
	}
	public static String LeadingZeros(String str)
	{
		String[] arr=str.split("\\s+");
		String temp="\0";
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if((Integer.parseInt(arr[i])!=0) && (Integer.parseInt(arr[j])==0))
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return String.join(" ",arr);
	}
}