package patterns;
import java.util.Scanner;
public class Piramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		System.out.println("enter size of n=");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n*2-1;j++)
			{
				if(j>=n+1-i && j<=n-1+i)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}

	}

}
