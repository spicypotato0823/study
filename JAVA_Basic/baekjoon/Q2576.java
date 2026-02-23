import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Q2576 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int j = 0;
        int enter;
        int sum = 0;
        int min = 100;

        for(int i = 0; i < 7; i++)
        {
            enter = (Integer.parseInt(bf.readLine()));
            
            if(enter % 2 != 0)
            {
                sum += enter;
                if(min > enter)
                {
                    min = enter;
                }

                j++;
            }
        }
        if(j == 0)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(sum);
            System.out.println(min);
        }

    }    
}
