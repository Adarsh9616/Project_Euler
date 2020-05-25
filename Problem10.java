public class Problem10
{
    public static void main(String args[])
    {
        boolean ar[]=new boolean[2000001];
        long sum=0;
        for(int i=2;i*i<2000001;i++)
        {
            if(ar[i]==false)
            {
                for(int j=i*i;j<2000001;j=j+i)
                {
                    ar[j]=true;
                }
            }
        }
        for(int i=2;i<2000001;i++)
        {
            if(ar[i]==false)
            {
                System.out.println(i);
                sum=sum+i;
            }

        }
        System.out.println(sum);
    }
}
