import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11047
{
    public static void main(String[] arg) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int [] num = new int[N];
        int sum = 0;
        for(int i = 0; i < N; i++)
        {
            num[i] = Integer.parseInt(bf.readLine());
        }
        for(int i = N - 1; i >= 0; i--)
        {
                sum += K / num[i];
                K %= num[i];
        }

        System.out.println(sum);
    }
}