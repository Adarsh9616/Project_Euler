import java.util.*;
public class Problem2
{
    public static void main(String args[])
    {
        //Scanner sc=new Scanner(System.in);
        long a=1;
        long b=2;
        long c;
        long sum=2;
        while(sum<4000000)
        {
            c=a+b;
            a=b;
            b=c;
            if((b&1)==0)
            {
                sum=sum+c;
            }


        }
        System.out.println(sum);
    }
}
