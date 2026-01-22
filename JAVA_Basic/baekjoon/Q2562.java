import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Q2562 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int max_n = 0;
        
        for(int i = 0; i < 9; i++)
        {
            int input = Integer.parseInt(bf.readLine());
            
            if(max < input)
            {
                max = input;
                max_n = i;
            }
        }
        
        System.out.println(max);
        System.out.println(max_n + 1);

    }    
}
