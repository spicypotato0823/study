import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Collections;

public class Q11279 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int x;
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < N; i++)
        {
            x = Integer.parseInt(bf.readLine());
            maxheap.add(x);

            if(x == 0)
            {
                sb.append(maxheap.poll());
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }    
}
