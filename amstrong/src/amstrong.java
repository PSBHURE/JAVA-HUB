import java.util.Scanner;
public class amstrong {

	public static void main(String[] args) {
		int no,temp=0,x,r;
		Scanner sc=new Scanner(System.in);
		System.out.print("no=");
		no=sc.nextInt();
		x=no;
		while(no!=0)
		{
			r=no%10;
			no=no/10;
			temp=temp+r*r*r;
		}
		no=x;
		if(no==temp)
		System.out.println(no+" is amstrong no");
		else
		System.out.println(no+" is not amstrong no");

	}

}
