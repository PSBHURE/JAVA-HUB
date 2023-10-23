import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		int no,i,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("no=");
		no=sc.nextInt();
		for(i=no;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.println(no+"!="+fact);

	}

}
