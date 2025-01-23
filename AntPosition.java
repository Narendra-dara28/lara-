import java.util.*;
class AntPosition
{
	public static void main(String[]args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the elements");
		
			n=sc.nextInt();
			
			int[]arr=new int[n];
			
		System.out.println("eneter valuese");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
			
		int currentPosition=0;
		int count=0;
		
		for(int m:arr)
		{
			currentPosition+=m;
			if(currentPosition==0)
			{
				count++;
			}
		}
		System.out.println("retrun to startin point "+count);
	}
}
			
			
			
		
			
			
		
		