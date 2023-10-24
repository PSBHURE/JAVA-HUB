import java.util.Scanner;
public class primeno_or_not {

	public static void main(String[] args)
	{
		int no,i;
		boolean result=false;
		System.out.print("no=");
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		for(i=2;i<no;i++)
		{
			if(no%i==0)
			{
				result=true;
				break;
			}
			else
				result=false;
		}
		if(result==true)
			System.out.println(no+" is not a prime no");
		else
			System.out.println(no+"  is a prime no");
	}

}
