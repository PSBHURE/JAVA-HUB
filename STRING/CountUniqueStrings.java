import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountUniqueStrings {

	public static void main(String[] args) {
		String[] arr;
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		size=sc.nextInt();
		arr=new String[size];
		System.out.println("enter "+size+" elements in array" );
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.next();
		}
		int no=NoOfUniqueStrings(arr);
		System.out.println("total no of unique strings in given array="+no);

	}

	private static int NoOfUniqueStrings(String[] arr) {
		Set<String>s=new HashSet<>();
		for(String i:arr)
		{
			s.add(i);
		}
		return s.size();
		
		
		
		
		
		
	    // Example String array
//        String[] stringArray = {"apple", "orange", "banana", "apple", "grapes", "orange"};
//
//        // Create a Set to store unique strings
//        Set<String> uniqueStrings = new HashSet<>();
//
//        // Iterate over the array and add each string to the set
//        for (String str : stringArray) {
//            uniqueStrings.add(str);
//        }

        // Print the number of unique strings
      //  System.out.println("Number of unique strings: " + uniqueStrings.size());
    
	}

}
