import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
//동적 계획법(Dtnamic Programming, DP) 표 채우기
public class Q12865 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int [] W = new int[N + 1];
        int [] V = new int[N + 1];

        int [][] dp = new int[N + 1][K + 1]; // 초기화를 따로 진행하지 않아도 0으로 자동으로 초기화가 되어있음
        for(int i = 1; i <= N; i++)
        {
            st = new StringTokenizer(bf.readLine()); // 반복문 안에 넣어줘야 매 줄마다 새로 읽음

            W[i] = Integer.parseInt(st.nextToken());
            V[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i <= N; i++) // i : 현재 고려하는 물건 번호
        {
            for(int j = 1; j <= K; j++) // j : 현재 가방의 무게 한도
            {
                if(j < W[i]) // 물건이 무거워 가방에 넣지 못하는 경우
                {
                    dp[i][j] = dp[i - 1][j]; // 첫 번째 물건도 dp[0][j]가 0으로 초기화 되어 있기에 문제 X
                }
                else // 물건을 넣을 수 있는 경우
                {
                    // 이전 줄의 최댓값보다 이번 아이템 가치 + 이전 줄 [무게제한 - 아이템 무게]의 최댓값을 비교 
                    if(dp[i - 1][j] < dp[i - 1][j - W[i]] + V[i]) 
                    {
                        dp[i][j] = dp[i - 1][j - W[i]] + V[i];
                    }
                    else
                    {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }
        }
        /*
       for(int i = 1; i <= N; i++)
       {
            for(int j = 1; j <= K; j++)
            {
                System.out.print(dp[i][j]);
                System.out.print(" ");
            }
            System.out.println();
       }
         */
        System.out.println(dp[N][K]);



    }
}
