import java.util.*;
import java.math.*;
public class Que1
{
	public static void main(String[] args)
	{
		System.out.print(FibonasiNO(153));
	}
	public static String FibonasiNO(int no)
	{
		BigInteger a=BigInteger.valueOf(-1);
		BigInteger b=BigInteger.ONE;
		BigInteger sum= BigInteger.ZERO;
		for(int i=0;i<=no;i++)
		{
			sum=a.add(b);
			a=b;
			b=sum;
		}
		return String.valueOf(sum);
	}
}