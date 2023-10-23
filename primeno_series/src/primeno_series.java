import java.util.Scanner;
public class primeno_series {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int startno,endno,i,j,count=0;
	System.out.print("startno=");
	startno=sc.nextInt();
	System.out.print("endno=");
	endno=sc.nextInt();
	for(i=startno;i<=endno;i++)
	{
		for(j=2;j<=i;j++)
		{
			if(i%j==0)
				break;
		}
		if(i==j)
			{
			System.out.println(" "+j+" ");
			count++;
			}
	}
	System.out.println("no of primeno between "+startno+" and "+endno+"="+count);
	}
	

}
