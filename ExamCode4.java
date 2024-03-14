import java.util.*;
public class ExamCode4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double P=1000,T=0,R=4;
		System.out.println("1.Gold Lone"+"  "+"2.Educational Loan");
		int ch, temp=sc.nextInt();
		if(temp==1)
		{
			System.out.println("you choose Gold Lone enter no of year");
			T=sc.nextDouble();
			if(T<4)
				ch=3;
			else
				ch=4;
		}
		else
			ch=2;
		switch (ch)
		{
			
			case 2:
					System.out.println("you choose Educational Loan ,please enter time span:");
					System.out.println("Amount="+P);
					break;
			case 3:
					System.out.println("Amount="+P);
					break;
					
			case 4:
				System.out.println("Amount="+(P+(P*R*T)/100));
					break;
					
		}
	}
}