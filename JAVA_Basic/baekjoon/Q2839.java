import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2839
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int t = n / 5;
        int r = n % 5;
        int c = 0;
        while (r != 0)
        {
            n -= 3;
            c++;
            t = n / 5;
            r = n % 5;

            if(n < 0)
            {
                t = -1;
                c = 0;
                break;
            }
        }
        System.out.println(t + c);
    }
}

/*
5로 나누기
나머지가 1인 경우 => t+1 (t-1+2)
나머지가 2인 경우 => t+2 (t-2+4)
나머지가 3인 경우 => t+1 (t+1)
나머지가 4인 경우 => t+2 (t-1+3)
나머지가 0인 경우 => t

edge case는 뭐가 있을까?
3 <= N <= 5000
N == 4 -> -1
N == 7 -> -1

 */