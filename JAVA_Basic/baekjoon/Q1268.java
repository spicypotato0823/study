import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;


public class Q1268 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int N;

        N = Integer.parseInt(bf.readLine());
        
        int [][] arr = new int[N][5];
        int [] count = new int[N];
        int [][] d = new int[N][N];

        for(int i = 0; i < N; i++)
        {
            StringTokenizer st = new StringTokenizer(bf.readLine());

            for(int j = 0; j < 5; j++)
            {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < N; j++)
            {
                for(int k = j + 1; k < N; k++)
                {
                    if(arr[j][i] == arr[k][i])
                    {
                        if(d[j][k] == 1)
                        {
                            continue;
                        }
                        count[j]++;
                        count[k]++;

                        d[j][k] = 1;
                        d[k][j] = 1;
                    }
                }
            }
        }
        int max = 0;
        for(int i = 0; i < N; i++)
        {
            if(count[max] < count[i])
            {
                max = i;
            }
        }

        System.out.println(max + 1);


    }    
}
