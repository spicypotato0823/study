import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11505
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int NFatorial = 1;
        for(int i = N; i > N - K; i--)
        {
            NFatorial *= i;
        }
        for(int i = K; i > 0; i--)
        {
            NFatorial /= i;
        }

        System.out.println(NFatorial);
    }
}