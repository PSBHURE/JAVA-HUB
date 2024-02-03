/*
   Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
  Output: 4 // x (or 2) occurs 4 times in arr[]
  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 3
  Output: 1 
  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 1
  Output: 2 
  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 4
  Output: -1 // 4 doesn't occur in arr[] 
 */
public class Occurrences {

	public static void main(String[] args) {
		int arr[] = {1, 1, 2, 2, 2, 2, 3};
		int j=occurrence(arr,2);
		System.out.print(j);
	}
	public static int occurrence(int[] arr,int n)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
				count++;
		}
		return count;
	}

}
