import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;


public class Q2884 
{
    public static void main(String[] arg) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        StringTokenizer st = new StringTokenizer(input);
        
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if(M >= 45)
        {
            M = M -45;
        }
        
        else
        {
            M = 15 + M;
            if(H >= 1)
            {
                H = H -1;
            }
            else
            {
                H = 23;
            }
        }
        System.out.printf("%d %d", H, M);
    }    
}
