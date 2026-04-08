import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Q15829
{
    public static void main(String []args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(bf.readLine());
        int r = 31;
        BigInteger m = new BigInteger("1234567891");
        BigInteger H = new BigInteger("0");
        String input = bf.readLine();

        for(int i = 0; i < l; i++)
        {
            int a = input.charAt(i) - 96;
            BigInteger ar = new BigInteger("1");
            ar = ar.multiply(BigInteger.valueOf(a));
            for(int j = 0; j < i; j++)
            {
                ar = ar.multiply(BigInteger.valueOf(r));
            }
            H = H.add(ar);
        }
        H = H.mod(m);

        System.out.println(H);
    }

}