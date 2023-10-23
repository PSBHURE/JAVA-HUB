import java.util.Scanner;
public class seriessum {

	public static void main(String[] args) {
	int lastno,i,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("lastno=");
	lastno=sc.nextInt();
	for(i=0;i<=lastno;i++)
	{
		sum=sum+i;
	}
	System.out.println("sum="+sum);
	}

}
