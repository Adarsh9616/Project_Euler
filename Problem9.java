public class Problem9
{
    public static void main(String args[])
    {
        int sum=1000;
        int a=1;
        long ans=1;
        for(;a<sum/3;a++)
        {
            int b=a+1;
            for(;b<sum/2;b++)
            {
                int c=sum-a-b;
                if((a*a+b*b)==c*c)
                {
                   ans=a*b*c;
                   break;
                }
            }
        }
        System.out.println(ans);
    }
}
