import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q34530
{
    public static int gcd(int a, int b)
    {
        while (b != 0)
        {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int d = Integer.parseInt(bf.readLine());
        int n = (d * 360) / gcd(d, 360);

        System.out.println(n / d);

    }
}