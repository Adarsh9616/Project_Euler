import java.util.*;

public class Problem1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long sum=0;
        int m3=3;
        int m5=5;
        int c3=1;
        int c5=1;
        while(m3<1000||m5<1000)
        {

            int min=Math.min(m3,m5);
            sum=sum+min;
            if(min==m3)
            {
                c3++;

            }
            if(min==m5)
            {
                c5++;

            }
            m3=3*c3;
            m5=5*c5;

        }
        System.out.println(sum);
    }
}
