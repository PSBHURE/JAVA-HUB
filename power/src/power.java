import java.util.Scanner;
public class power {
	public static void main(String[] args)
	{
		int m,n,i,no=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("m=");
		m=sc.nextInt();
		System.out.print("n=");
		n=sc.nextInt();
		no=m;
		for(i=1;i<n;i++)
		{
			no=no*m;
		}
		System.out.println(m+"  to the power "+n+"="+no);
	}
}
