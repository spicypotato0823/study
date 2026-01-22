import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Q11720 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String S = bf.readLine();
        int sum = 0;

        for(int i = 0; i < N; i++)
        {
            sum += (S.charAt(i) - '0');
        }

        System.out.println(sum);
    }    
}
