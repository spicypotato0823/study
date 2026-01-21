import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;



public class Q10951 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int a;
        int b;

        while ((input = bf.readLine()) != null) 
        {
            StringTokenizer st = new StringTokenizer(input);

            if(!st.hasMoreTokens())
            {
                break;
            }
            
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            System.out.println(a + b);
        }        
        
    }
}
