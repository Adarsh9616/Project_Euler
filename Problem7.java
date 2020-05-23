
public class Problem7
{
    public static void main(String args[])
    {
        boolean ar[]=new boolean[10000001];
        ar[0]=true;
        for(int i=2;i*i<=10000000;i++)
        {
            if(ar[i]==false)
            {
                for(int j=i*i;j<=1000000;j=j+i)
                {
                    ar[j]=true;
                }
            }
        }
        int count=0;
        int ans=0;
        for(int i=2;i<10000000;i++)
        {
            if(ar[i]==false)
            {
                count++;
            }
            if(count==10001)
            {
                ans=i;
                break;
            }
        }
        System.out.println(ans);

    }

}
