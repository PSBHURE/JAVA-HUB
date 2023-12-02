import java.util.Scanner;
public class tax_calculation {

	public static void main(String[] args) {
		double sal;
		Scanner sc=new Scanner(System.in);
		System.out.print("sal=");
		sal=sc.nextDouble();
		if(sal<150000)
			System.out.println("tax="+(sal*0));
		else if(sal>150000 & sal<300000)
			System.out.println("tax="+(sal*0.20));
		else
			System.out.println("tax="+(sal*0.30));
	}

}
