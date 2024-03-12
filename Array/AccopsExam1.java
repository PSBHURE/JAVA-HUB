public class AccopsExam1
{
	public static void main(String[] args)
	{
		System.out.print(LeadingZero("1 0 20 0 69 0 89 0 100 22"));
	}
	public static String LeadingZero(String str)
	{
		String[] arr=str.split("\\s+");
		int left=0;
		int right=0;
		String temp="\0";
		while(right<arr.length)
		{
			if(Integer.parseInt(arr[right])!=0)
			{
				temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
			}
			right++;
		}
		return String.join(" ",arr);
	}
}