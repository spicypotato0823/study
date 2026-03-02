import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2231
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int i = 1;
        
        while (i < N) 
        {
            int t = i;    
            int M = i;

            while (t != 0) // i를 직접 나눠버리면 for문이 고장나기 때문에 t로 대신 돌리기
            {
                M += t % 10;
                t /= 10;
            }
            
            if(M == N)
            {
                System.out.println(i);
                break;
            }

            i++;
        }

        if(i == N)
        {
            System.out.println(0);
        }

    }


}