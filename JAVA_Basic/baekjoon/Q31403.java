import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q31403 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String A = bf.readLine();
        String B = bf.readLine();
        String C = bf.readLine();
        int sum1 = Integer.parseInt(A) + Integer.parseInt(B) - Integer.parseInt(C);
        int sum2 = Integer.parseInt(A + B) - Integer.parseInt(C);

        System.out.println(sum1);
        System.out.println(sum2);
        
        
    }    
}
