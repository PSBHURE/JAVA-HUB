package patterns;

import java.util.Scanner;

public class ReversArrow {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,no;
		System.out.println("enter size of arrow=");
		no=sc.nextInt();
		for(i=1;i<=2*no-1;i++)
		{
			for(j=1;j<=no;j++)
			{
				if(i<=no && (j>=no+1-i && j<=no)||(i>no && (j>=i+1-no&&j<=no)))
					System.out.print(" * ");
				
				else
					System.out.print("   ");
			}
			System.out.println();
		}

	}

}
