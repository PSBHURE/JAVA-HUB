import java.util.*;
public class ExamCode5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr={10,20,30,40,50,60};
		System.out.print("Enter target=");
		int ch=0,sum=0, target=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		if(sum>target)
		ch=1;
		else if(sum<target)
		ch=2;
		switch (ch)
		{
		case 1:
			System.out.print("sum of array is grater than target");
			break;
		
		case 2:
			System.out.print("sum of array is less than target");
			break;
		
		default :
			System.out.print("sum of array is equal to target");
			
		}
		
	}
}