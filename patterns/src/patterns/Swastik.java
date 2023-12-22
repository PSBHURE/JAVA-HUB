package patterns;
import java.util.Scanner;
public class Swastik {
public static void PrintSwastik(int n)
{
	int i,j;
	if(n%2==1)
	{
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if((i==((n/2)+1) || j==((n/2)+1))||(i==1 && j>n/2+1)||(i==n && j<n/2+1)||(j==1&&i<n/2+1)||(j==n&&i>n/2+1))
				{
					System.out.print(" * ");
				}
				else
					System.out.print("   ");
				
			}
			System.out.println();
		}
	}
	else
		System.out.println("please enter even no SWASTIK can't made for odd no");
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter size of swastik=");
		n=sc.nextInt();
		PrintSwastik(n);

	}

}
//