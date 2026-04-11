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
        long r = 1;
        long H = 0;
        long M = 1234567891;

        String input = bf.readLine();

        for(int i = 0; i < l; i++)
        {
            int a = input.charAt(i) - 96;
            long term = (a * r) % M;
            H =(H + term)% M;
            r = ( r * 31 )% M;
        }
        System.out.println(H);
    }

}