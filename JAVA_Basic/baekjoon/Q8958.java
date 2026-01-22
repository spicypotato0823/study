import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Q8958 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N;
        int sum;
        int count;
        N = Integer.parseInt(bf.readLine());
        
        for(int i = 0; i < N; i++)
        {
            sum = 0;
            count = 0;
            String S = bf.readLine();

            for(int j = 0; j < S.length(); j++)
            {
                if(S.charAt(j) == 'O')
                {
                    count += 1;
                    sum += count;
                }
                else
                {
                    count = 0;
                }
            }
            System.out.println(sum);
        }



    }    
}
