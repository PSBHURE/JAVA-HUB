import java.util.Scanner;
public class gretestno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no1,no2,no3;
		System.out.print("no1=");
		no1=sc.nextInt();
		System.out.print("no2=");
		no2=sc.nextInt();
		System.out.print("no3=");
		no3=sc.nextInt();
		if((no1>no2)&&(no1>no3))
			System.out.println(no1+" is largest no");
		if((no2>no1)&&(no2>no3))
			System.out.println(no2+" is largest no");
		if((no3>no1)&&(no3>no2))
			System.out.println(no3+" is largest no");
	}

}
