import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q32403
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int sum = 0;

        ArrayList<Integer> T_num = new ArrayList<Integer>();

        for(int i = 1; i <= T; i++)
        {
            if(T % i == 0)
            {
                T_num.add(i);
            }
        }
        st = new StringTokenizer(bf.readLine());

        for(int i = 0; i < N; i++)
        {
            int min = 99999;
            int num = Integer.parseInt(st.nextToken());

            for(int j : T_num)
            {
                if(min > Math.abs(j - num))
                {
                    min = Math.abs(j - num);
                }
            }

            sum += min;
        }

        System.out.print(sum);
    }
}