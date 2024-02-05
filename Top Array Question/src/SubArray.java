/*
 Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Output: Sum found between indexes 2 and 4
Explanation: Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33

Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
Output: Sum found between indexes 1 and 4
Explanation: Sum of elements between indices 1 and 4 is 4 + 0 + 0 + 3 = 7

Input: arr[] = {1, 4}, sum = 0
Output: No subarray found
Explanation: There is no subarray with 0 sum
*/
public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 4, 20, 3, 13, 5}, sum = 33;
		int arr2[]= TwoSum(arr,sum);
		for(int i=0;i<arr2.length;i++)
		{
			System.out.printf(arr2[i]+" ");
			System.out.println();
		}
		
	}
	public static int[] TwoSum(int[] arr,int sum)
	{
		int[] arr1=new int[2];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==sum)
				{
					arr1[0]=i;
					arr1[1]=j;
				}
			}
		}
		return arr1;
	}

}
