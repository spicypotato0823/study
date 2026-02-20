
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1920
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int [] arr = new int[n];
        int p;
        StringTokenizer st = new StringTokenizer(bf.readLine());

        for(int i = 0; i < n; i++)
        {
            int target = Integer.parseInt(st2.nextToken()); // 타겟
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(bf.readLine());
        StringTokenizer st2 = new StringTokenizer(bf.readLine());

        for(int i = 0; i < m; i++)
        {
            p = 0;
            for(int j = 0; j < n; j++)
            {
                if(Integer.parseInt(st2.nextToken()) == arr[j])
                {
                    p = 1;
                    break;
                }
            }
            System.out.println(p);
        }
    }    
}
