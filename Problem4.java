public class Problem4
{
    static boolean palin(long n)
    {
        String s=String.valueOf(n);
        String st="";
        for(int i=0;i<s.length();i++)
        {
            st=s.charAt(i)+st;
        }
        if(s.equals(st))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        long largest=-1;
        for(int i=999;i>=100;i--)
        {
            for(int j=999;j>=100;j--)
            {
                long k=i*j;
                if(palin(k))
                {
                    //System.out.println(largest);
                    if(largest<k)
                    {
                        largest=k;
                        //System.out.println(largest);

                    }
                }
            }
        }
        System.out.println(largest);
    }
}
