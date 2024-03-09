public class TwoSumCode
{
	public static void main(String[] args)
	{
		int arr[]={-3,1,2,3,3,8,15};
		int target=6;
		int arr1[]=Two_Sum(arr,target);
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
	}
	public static int[] Two_Sum(int[] arr,int sum)
	{
		int begin=0,end=arr.length-1,sum1=0;
		int[] arr1=new int[2];
		while(begin<end)
		{
			sum1=arr[begin]+arr[end];
			if(sum1>sum)
			end--;
			if(sum1<sum)
			begin++;
			else
			if(sum1==sum)
			{
			arr1[0]=begin;
			arr1[1]=end;
			break;
			}
		}
		return arr1;
	}
}