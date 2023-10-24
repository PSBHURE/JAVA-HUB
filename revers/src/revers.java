import java.util.Scanner;
public class revers {

	public static void main(String[] args) {
		int no,temp=0,r,i,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("no=");
		no=sc.nextInt();
		temp=no;
		while(no!=0)
		{
			r=no%10;
			no=no/10;
			rev=rev*10+r;
		}
		no=temp;
		System.out.println("revers no of "+no+"="+rev);
	}

}
