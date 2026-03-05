import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1436 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int num = 665;
        int count = 0;

        while(count < N)
        {
                int t = num;
                int six = 0;
                while (t != 0) // num에 666이 있는지 검사.
                {
                    if(t % 10 == 6)
                    {
                        six++;

                        if(six == 3)
                        {
                            break;
                        }
                    }
                    else
                    {
                        six = 0;
                    }

                    t /= 10;
                }

                if(six == 3)
                {
                    count++;
                }
                if(count < N)
                {
                    num++;
                }
        }
        System.out.println(num);

    }
}
