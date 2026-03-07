import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1929 
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int [] num = new int[N + 1];
        num[1] = 1;

        for(int i = 2; i <= N; i++)
        {
            if(num[i] == 1) // 다른 수의 배수인 경우 바로 스킵
            {
                continue;
            }

            int t = 2;

            while(t * i <= N)
            {
                num[t * i] = 1; // 소수라고 판별되면 i*2부터 1로 처리. 
                t++;
            }
        }

        for(int i = M; i <= N; i++)
        {
            if(num[i] == 0)
            {
                System.out.println(i);
            }
        }

        
    }
}