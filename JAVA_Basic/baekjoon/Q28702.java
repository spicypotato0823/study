import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Q28702 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = 0;
        
        for(int i = 0; i < 3; i++)
        {
            String st = bf.readLine();

            if(Character.isDigit(st.charAt(0)))
            {
                N = Integer.parseInt(st) + 3 - i;
            }
        }

        if(N % 3 == 0)
        {
            sb.append("Fizz");
        }
        if(N % 5 == 0)
        {
            sb.append("Buzz");
        }
        if(sb.length() == 0)
        {
            sb.append(N);
        }

        System.out.println(sb);
    }    
}
