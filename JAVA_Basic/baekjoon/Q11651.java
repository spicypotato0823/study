import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Q11651
{
    public static class coordinate
    {
        int x;
        int y;
        coordinate(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        coordinate [] cor = new coordinate[N];
        for(int i = 0; i < N; i++)
        {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            cor[i] = new coordinate(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));

        }
        Arrays.sort(cor, (c1,c2) ->
        {
            if(c1.y == c2.y)
            {
                return c1.x - c2.x;
            }
            else
            {
                return c1.y - c2.y;
            }
        });

        for(int i = 0; i < N; i++)
        {
            System.out.println(cor[i].x + " " + cor[i].y);
        }


    }
}