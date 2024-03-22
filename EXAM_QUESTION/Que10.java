public class Que10
{
	public static void main(String[] args)
	{
	String str="A abcdaeg xyeioz lmnouiep eiou";
	System.out.print(check(str));
	}
	public static String check(String str)
	{
		StringBuffer temp=new StringBuffer(str);
		char var='\0';
		for(int i=0;i<str.length();i++)
		{
			int j=i+1;
				if((temp.charAt(i)=='a')||(temp.charAt(i)=='e')||(temp.charAt(i)=='i')||(temp.charAt(i)=='o')||(temp.charAt(i)=='u'))
				{
					var=temp.charAt(i);
					while(j>0)
					{
						if((temp.charAt(j)!='a')||(temp.charAt(j)!='e')||(temp.charAt(j)!='i')||(temp.charAt(j)!='o')||(temp.charAt(j)!='u'))
							break;
						j++;
					}
				}
temp.replace(i,j,String.valueOf(Character.toUpperCase(var)));				
		}
		return new String(temp);
	}
}