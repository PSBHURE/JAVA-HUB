package patterns;
import java.util.Scanner;
public class Hollow_square {

	public static void main(String[] args) {
	int n,i,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of square");
	n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		{
			if(i==1||i==n||j==1||(j==n&&(i>=1&&i<=n)))
			{
				System.out.print(" * ");
			}
			else
			System.out.print("   ");
		}
		System.out.println();
	}

	}

}
