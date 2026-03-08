import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q18110 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int [] level = new int[31];
       
        for(int i = 0; i < n; i++) //num배열에 각 난이도 별 투표 개수 저장
        {
            int input = Integer.parseInt(bf.readLine());
            level[input]++;
        }

        int n_15 = (int) Math.round(n * 0.15f);

        int min = 1;
        int max = 30;

        for(int i = 0; i < n_15; i++)
        {
            while(level[min] == 0)
            {
                min++;
            }
            while(level[max] == 0)
            {
                max--;
            }

            level[min]--;
            level[max]--;
        }

        
        double sum = 0;

        for(int i = 1; i <= 30; i++)
        {
            sum += i * level[i];
        }

        int average = (int) Math.round(sum/(n-n_15*2));
        System.out.println(average);
 
    }    
}
