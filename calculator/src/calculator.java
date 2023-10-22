import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		int ch;
		double no1,no2,result=0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.print("1.add  2.sub  3.mul  4.div  5.exit::");
			ch=sc.nextInt();
			
			switch (ch)
			{
			case 1:
				System.out.print("no1=");
				no1=sc.nextDouble();
				System.out.print("no2=");
				no2=sc.nextDouble();
				result=no1+no2;
				System.out.println("add="+result);
				break;
			case 2:
				System.out.print("no1=");
				no1=sc.nextDouble();
				System.out.print("no2=");
				no2=sc.nextDouble();
				result=no1-no2;
				System.out.println("sub="+result);
				break;
			case 3:
				System.out.print("no1=");
				no1=sc.nextDouble();
				System.out.print("no2=");
				no2=sc.nextDouble();
				result=no1*no2;
				System.out.println("mul="+result);
				break;
			case 4:
				System.out.print("no1=");
				no1=sc.nextDouble();
				System.out.print("no2=");
				no2=sc.nextDouble();
				result=no1/no2;
				System.out.println("div="+result);
				break;
			default:
				System.out.println("please enter valid option");
			}
		   }while(ch!=5);
}
}
