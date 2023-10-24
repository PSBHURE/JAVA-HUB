import java.util.Scanner;
public class oddevensum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no,i,oddsum=0,evensum=0;
		System.out.print("no=");
		no=sc.nextInt();
		for(i=0;i<=no;i++)
		{
			if(i%2==0)
			{
				evensum=evensum+i;
			}
			else
				oddsum=oddsum+i;
				
		}
		System.out.println("oddsum="+oddsum+"  evensum="+evensum);

	}

}
