import java.util.Scanner;
public class triangle {

	public static void main(String[] args) {
		float angle1,angle2,angle3;
		Scanner sc=new Scanner(System.in);
		System.out.print("angle1=");
		angle1=sc.nextFloat();
		System.out.print("angle2=");
		angle2=sc.nextFloat();
		System.out.print("angle3=");
		angle3=sc.nextFloat();
		if((angle1+angle2+angle3)==180)
			System.out.println("sum of all angles=180 therefore triangle is valid");
		else
			System.out.println("sum of all angles="+(angle1+angle2+angle3)+"  therefore triangle is invalid");
	}

}
