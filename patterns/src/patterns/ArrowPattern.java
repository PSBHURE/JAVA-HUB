package patterns;

import java.util.Scanner;

public class ArrowPattern {
	public static void PrintArrow(int n)
	{
		int i,j;
		for(i=1;i<=2*n-1;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i<=5 ||(i>5 && j<=n*2-i))
				{
					System.out.print(" * ");
				}
				else 
					System.out.print("   ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size of arrow=");
		int n=sc.nextInt();
		if(n%2!=0)
		PrintArrow(n);
		else
			System.out.println("arrow can be made only for odd no");
			
	}
}
