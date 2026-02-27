import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Q30802
{
    public static void main(String[] args) throws IOException
    {
        StringBuilder sb = new StringBuilder();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        StringTokenizer st1 = new StringTokenizer(bf.readLine());
        int T = Integer.parseInt(st1.nextToken());
        int P = Integer.parseInt(st1.nextToken());

        int sum = 0;
        for(int i = 0; i < 6; i++)
        {
            int num = Integer.parseInt(st.nextToken());
            sum += num / T;
            if(num % T != 0)
            {
                sum += 1;
            }
        }

        sb.append(sum);
        sb.append("\n");
        sb.append(N/P);
        sb.append(" ");
        sb.append(N%P);

        System.out.println(sb);

    }
}