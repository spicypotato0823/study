import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q14626
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String st = bf.readLine();
        int sum = 0;
        int p = 0;

        for(int i = 1; i <= 12; i++)
        {
            int G;

            if(i % 2 == 0)
            {
                G = 3;
            }
            else
            {
                G = 1;
            }

            if(Character.isDigit(st.charAt(i - 1)))
            {
                sum += G * (st.charAt(i - 1) - '0');  
            }
            else
            {
                p = G;
            }
        }

        for(int i = 0; i < 10; i++)
        {
            if(((st.charAt(12) - '0') + (sum + p * i)) % 10 == 0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
