import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2745 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int sum = 0;
        int num;
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N.length(); i++)
        {
            num = 0;

            if(N.charAt(i) < ':')
            {
                num = N.charAt(i) - '0';
            }
            else
            {
                num = N.charAt(i) - 'A' + 10;
            }

            sum = sum * B + num;
        }

        System.out.println(sum);
        
    }    
}
