package patterns;

import java.util.Scanner;

public class HollowRectangle {
	public static void PrintRectangle(int row,int col) {
		int i,j;
		
		for(i=1;i<=row;i++)
		{
			for(j=1;j<=col;j++)
			{
				if(i==1||i==row||j==1||(j==col && (i>=1&&i<=row)))
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}	
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row,col;
		System.out.println("enter row");
		row=sc.nextInt();
		System.out.println("enter col");
		col=sc.nextInt();
		PrintRectangle(row,col);
	}
	
	

}
