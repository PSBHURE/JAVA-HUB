package patterns;

import java.util.Scanner;

public class OddPeramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		System.out.println("enter size of n=");
		n=sc.nextInt();
		if(n%2!=0)
		{
			for(i=1;i<=n;i++)
			{
				for(j=1;j<=n*2-1;j++)
				{
					if(i%2!=0)
					{
						if(j%2!=0 && ((j>=n+1-i)&&(j<=n-1+i)))
						{
							System.out.print("*");
						}
						else
							System.out.print(" ");
						
					}
					if(i%2==0)
					{
						if(j%2==0 && ((j>=n+1-i)&&(j<=n-1+i)))
							   System.out.print("*");
						
					     else
							   System.out.print(" ");
							
				    }
			}

				System.out.println();
		}
		}
		else
			System.out.println("work only for odd no");
	}
}
