import java.util.Scanner;
public class pizzashop {

	public static void main(String[] args) {
		int ch,total=0,mcount=0,ocount=0,pcount=0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1.margrita(RS200/-)  2.onion(RS150/-)  3.panner(RS400/-)  4.exit");
			ch=sc.nextInt();
			switch (ch)
			{
			case 1:
				System.out.println("enter no of margrita");
				mcount=sc.nextInt();
				total=total+mcount*200;
				break;
			
			case 2:
				System.out.println("enter no of onion");
				ocount=sc.nextInt();
				total=total+ocount*150;
				break;
				
			case 3:
				System.out.println("enter no of paneer");
				pcount=sc.nextInt();
				total=total+pcount*400;
				break;
				
			default:
				System.out.println("please enter valid option");
			}
		}while(ch!=4);
		System.out.println("your total bill="+total);
		System.out.println("-------thankyou please visit again-------");
	}

}
