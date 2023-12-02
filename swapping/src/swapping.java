import java.util.Scanner;
public class swapping {

	public static void main(String[] args) {
	int no1,no2,temp;
	System.out.println("Enter no1:");
	Scanner sc=new Scanner(System.in);
	no1=sc.nextInt();
	System.out.println("Enter no2:");
    no2=sc.nextInt();
    System.out.println("Before swap:no1="+no1+"  no2="+no2);
    temp=no1;
    no1=no2;
    no2=temp;
    System.out.println("After swap:no1="+no1+"  no2="+no2);
    		
	}
}
