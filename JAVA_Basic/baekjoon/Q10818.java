import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Q10818
{
    public static void main(String[] arg) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N;
        N = Integer.parseInt(bf.readLine());
        
        int max;
        int min;
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int[] arr = new int[N];

        for(int i = 0; i < N; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        max = arr[0];
        min = arr[0];
        for(int i = 0; i < N; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }

            if(min > arr[i])
            {
                min = arr[i];
            }
        }

        System.out.printf("%d %d", min, max);
     }
}
