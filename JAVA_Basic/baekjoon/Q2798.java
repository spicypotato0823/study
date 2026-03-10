
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2798 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());
        
        int [] num = new int[N];
        
        StringTokenizer st = new StringTokenizer(bf.readLine());

        for(int i = 0; i < N; i++)
        {
            num[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        
        for(int i = 0; i < N; i++)
        {
            for(int j = i + 1; j < N; j++)
            {
                for(int k = j + 1; k < N; k++)
                {
                    int t = num[i] + num[j] + num[k];
                    
                    if(t > M)
                    {
                        continue;
                    }

                    if(t > sum)
                    {   
                        sum = t;
                    }
                }
            }
        }

        System.out.println(sum);

        
    }    
}
