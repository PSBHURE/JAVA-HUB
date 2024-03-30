import java.util.*;
public class StringBufferTesting
{
	public static void main(String[] args)
	{
		String str="www.w3ResourcE.com";
		check(str);
	}
	public static void check(String str)
	{
		StringBuffer temp=new StringBuffer(str);
		
			System.out.println("orignal String=>"+temp);
			
			char ch=temp.charAt(3);
			System.out.println(ch);
			
			/*temp.delete(0,3);
			System.out.println(temp);*/
			
			/*temp.replace(0,3,"X");
			System.out.println(temp);*/
			
			/*temp.insert(3,'X');
			System.out.println(temp);*/
			
			/*temp.setCharAt(3,'Z');
			System.out.println(temp);*/
			
			temp.setLength(0);
			System.out.println(temp);
		
	}
}