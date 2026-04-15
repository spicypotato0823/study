import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Q10816
{
    public static void main(String [] args) throws IOException
    {
        int [] numCard = new int [20000001];
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < n; i++)
        {
            int card = Integer.parseInt(st.nextToken());
            numCard[card + 10000000]++;
        }
        int m = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < m; i++)
        {

            int card = Integer.parseInt(st.nextToken());
            System.out.print(numCard[card + 10000000] + " ");
        }



    }

}
