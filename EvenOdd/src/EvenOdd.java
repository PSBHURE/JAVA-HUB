import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		int no;
		System.out.println("Enter an Integer value:");
		Scanner sc;
		sc=new Scanner(System.in);
		no=sc.nextInt();
		if(no%2==0) {
			System.out.println(no+" is even");
		}
		else {
			System.out.println(no+" is odd");
		}
	}

}
