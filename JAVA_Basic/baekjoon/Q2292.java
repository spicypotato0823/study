import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2292 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int a = 0;
        int b = 1;
        int n = 0;
        while((N < a)||(N > b))
        {
            n++;
            a = b + 1;
            b += 6 * n;
        }
        System.out.println(n + 1);
    }    
}
