import java.math.BigInteger;

public class Problem6
{
    public static void main(String args[])
    {
        BigInteger n=new BigInteger("0");
        BigInteger s=new BigInteger("0");
        BigInteger l=new BigInteger("100");
        BigInteger m=new BigInteger("1");

        for(BigInteger i=new BigInteger("1");i.compareTo(l)<=0;i=i.add(m))
        {
            n=n.add(i.pow(2));
            s=s.add(i);

        }
        BigInteger k=s.pow(2);
        System.out.println(k.subtract(n));

    }
}

