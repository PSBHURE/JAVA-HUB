import java.util.*;
public class Test10
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int count=0;
		char ch='\0';
		List<Character>list=new ArrayList<>();
		List<Character>list1=new ArrayList<>();
		while(count<26)
		{
			System.out.println("enter character:");
			ch=sc.nextLine().charAt(0);
			list.add(ch);
			if(((int)ch>=65 && (int)ch<=95) || ((int)ch>=97 && (int)ch<=122))
			count++;
		}
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)!=' ')
			{
				int base=Character.isLowerCase(list.get(i))?'a':'A';
				char temp=(char)(base+(list.get(i)-base+i)%26);
				list1.add(temp);
			}
			if(list.get(i)==' ')
			list1.add(' ');
		}
		for(char j:list1)
		{
			System.out.print(j);
		}
		
	}
}












/* // Read a single character from the user
        char character = scanner.next().charAt(0);*/