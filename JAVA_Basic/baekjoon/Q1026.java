import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Arrays;

public class Q1026 
{
    public static void main(String[] args) throws IOException
    {
        int S = 0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));   
        int N = Integer.parseInt(bf.readLine());
        int [][] arr = new int [2][N];
      
        for(int i = 0; i < 2; i++)
        {
            StringTokenizer st = new StringTokenizer(bf.readLine());

            for(int j = 0; j < N; j++)
            {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr[i]);
        }

        for(int i = 0; i < N; i++)
        {
            S += arr[0][i] * arr[1][N - i - 1];
        }

        System.out.println(S);
    }
}