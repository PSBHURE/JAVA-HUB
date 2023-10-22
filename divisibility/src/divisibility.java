import java.util.Scanner;
public class divisibility {

	public static void main(String[] args) {
		int no;
		System.out.println("no=");
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		if(no%5==0 && no%7==0)
		{
			System.out.println(no+" is divisible by 5 & 7");
		}
		else
			System.out.println(no+" is not divisible by 5 & 7");
	}

}
