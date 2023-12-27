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
			for(j=1;j<=no;j++)
			{
				if(i<=no/2 &&(j>=no/2+1-i && j<=no/2-1+i))
					System.out.print(" * ");
				if(i>no/2 &&())
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}

	}

}
