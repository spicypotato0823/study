
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1676
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int count = 0;
        while(N > 0)
        {
            int t = N;
            while(t % 5 == 0)
            {
                count++;
                t /= 5;
            }
            N--;
        }
        System.out.println(count);
    }
}