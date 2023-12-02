import java.util.Scanner;
public class addition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no1,no2,no3;
		System.out.print("enter no1=");
		no1=sc.nextInt();
		System.out.print("enter no2=");
		no2=sc.nextInt();
		no3=no1+no2;
		System.out.println(no1+"+"+no2+"="+no3);

	}

}
