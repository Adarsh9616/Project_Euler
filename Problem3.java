import java.math.BigInteger;

public class Problem3
{
    public static void main(String args[])
    {
        long largest=0;
        long num=775147;
        BigInteger n=new BigInteger("600851475143");
        BigInteger ii;
        BigInteger z=new BigInteger("0");
        for(int i=3;i<=num;i+=2)
        {
            ii=new BigInteger(String.valueOf(i));

            while(n.mod(ii).equals(z))
            {
                n=n.divide(ii);
                largest=i;
            }

        }
        System.out.println(largest);

    }
}
