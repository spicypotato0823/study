import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q18111 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));       
        StringTokenizer st1 = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());
        int B = Integer.parseInt(st1.nextToken());

        int [][] height = new int[N][M];
       
        //각 좌표에 해당한 높이 저장 & 가장 많은 높이
        for(int i = 0; i < N; i++)
        {
            StringTokenizer st2 = new StringTokenizer(bf.readLine());
            for(int j = 0; j < M; j++)
            {
                int num = Integer.parseInt(st2.nextToken());
                height[i][j] = num;
            }
        }
        int minTime = Integer.MAX_VALUE;
        int optimalHeight = -1;

        for(int T = 0; T < 257; T++)
        {
        int D = 0;
        int F = 0;

        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < M; j++)
            {
                if(T - height[i][j] < 0)
                {
                    D -= T - height[i][j];
                }
                else
                {
                    F += T - height[i][j];
                }

            }
        }

        if(D + B < F)
        {
            continue;
        }
        else
        {
            if(minTime >= D*2 + F)
            {
                minTime = D*2 + F;
                optimalHeight = T;
            }
        }

        }
        
        System.out.printf("%d %d",minTime, optimalHeight);
    }    
}
