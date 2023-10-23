import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		int no,r,temp=0,i,newno=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("no=");
		no=sc.nextInt();
		temp=no;
		while(no!=0)
		{
			r=no%10;
			no=no/10;
			newno=newno*10+r;
		}
		no=temp;
		if(no==newno)
		{
			System.out.println(no+" is palindrome");
		}
		else
			System.out.println(no+" is not palindrome");
	}

}
