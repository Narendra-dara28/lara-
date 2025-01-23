import java.util.*;
public class amstrong1 {
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);

       System.out.println("Enter the number");
      int n=sc.nextInt();
        int temp=0;
        int m;
        int o=n;
        while(n>0)
        {
             int t=n%10;

           m=(int)Math.pow(t,3);

             temp=temp+m;

             n=n/10;

        }
        if(temp==o)
        {
            System.out.println("it is amstrong");
        }
        else{
            System.out.println("not amstrong");
        }
    }
}