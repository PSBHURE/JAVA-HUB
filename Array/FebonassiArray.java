import java.math.*;
public class FebonassiArray
{
	public static void main(String[] args)
	{
		System.out.println(Febonasi(153,50));
	}
	public static String Febonasi(int upto,int sequence)
	{
		BigInteger[] arr=new BigInteger[upto];
		BigInteger a=BigInteger.valueOf(-1);
		BigInteger b=BigInteger.ONE;
		BigInteger sum=BigInteger.ZERO;
		for(int i=0;i<upto;i++)
		{
			sum=a.add(b);
			a=b;
			b=sum;
			arr[i]=sum;
		}
		return String.valueOf(arr[sequence-1]);
	}
}

