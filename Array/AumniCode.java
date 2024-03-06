/*
write a function in such a way who crate array and accept till 1st -ve value comes and if 
value more than 45 c/as internal value replace it by -1,if value is completly divisible by 6 
c/as external value replace it by -5,if value is internal no. and external no. replace it by -2
,except than this send remain values as it is
eg. i/p=>50,5,6,72,-1
	o/p=>-1,5,-5,-2
*/
public class AumniCode
{
	public static void main(String[] args)
	{
		int[] arr={50,5,6,72,-1};
//STEP-5:call that define fuction
		int[] arr2=MakeArray(arr);
//STEP-6:print that array which come from "MakeArray" and it store in "arr2" array thats why we itterate arr2
		for(int i:arr2)
		{
		System.out.print(i+" ");
		}
	}
	public static int[] MakeArray(int[] arr)
	{
/*STEP-1:try to count how many no are there in given array till 1st -ve no. found wherever 
	     1st -ve no found stop counting for this i use if-else condition in foreach loop*/
		int count=0;
		for(int i:arr)
		{
			if(i>0)
			count++;
			else
			break;
		}
/*STEP-2:create new array (name as "arr1") whose size is as per "count" variable beacause it has count how many
		 +ve no comes before 1st -ve no in an given "arr"*/
		int[] arr1=new int[count];
		
/*STEP-3:fill this "arr1" as per given condition and whenever we want to select something and reject somthing 
		 in samecode then we have to use if-else conditions*/	
		for(int i=0;i<arr.length;i++) //travers the given "arr" till its length i.e completely
		{
			if(arr[i]>0)				//{1}=>if element of arr is +ve then only fill arr1 array
			{
				if(arr[i]>45)			//1.1=>if no grater than 45 then only enter in this bracket
				{
					if(arr[i]%6==0)		//1.1.1=>if no reach upto this this line then it is obvesly grater 
					arr1[i]=-2;			//than 45 so chech now is it divisilbe by 6 ,if yes replace it by -2 
					
					else				//1.1.1=>if no reach upto this this line then it is obvesly grater 
					arr1[i]=-1;			//than 45 but not divisible by 6 replace it by -1
					
				}
				else if(arr[i]%6==0)	//1.2=>if no divisible by 6 replace it by -5
					arr1[i]=-5;
				else
					arr1[i]=arr[i];		//1.2=>if no not grater than 45 and not even divisible by
			}							//6 then send that no as itis

			else						//{2}=>if element of arr is -ve stop filling arr1 array
			break;
		}
/*STEP-4:return this "arr1" array back from where this function called*/
		return arr1;
	}
}