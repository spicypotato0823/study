import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;


public class Q1225 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        String A = st.nextToken();
        String B = st.nextToken();
        long sum = 0;

        for(int i = 0; i < A.length(); i++)
        {
            for(int j = 0; j < B.length(); j++)
            {
                sum += (A.charAt(i) - '0') * (B.charAt(j) - '0');
            }
        }

        System.out.println(sum);

        
    }    
}
