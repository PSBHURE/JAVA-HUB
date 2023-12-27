package patterns;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,no;
		System.out.println("enter size of pendal");
		no=sc.nextInt();
		for(i=1;i<=no;i++)
		{
			for(j=1;j<=no*2-1;j++)
			{
				if(j>=no+1-i && j<=no-1+i)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
		for(i=1;i<=no;i++)
		{
			for(j=1;j<=no*2-1;j++)
			{
				if(j<no*2-i && j>i)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();

	}
	}
}


