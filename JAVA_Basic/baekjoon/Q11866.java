import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class Q11866 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        StringTokenizer st = new StringTokenizer(input);
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        sb.append('<');

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++)
        {
            queue.offer(i + 1);
        }

        while (queue.size() > 1) 
        {
            for(int i = 0; i < K - 1; i++)
            {
                queue.offer(queue.poll());
            }    
            
            sb.append(queue.poll()).append(", ");
        }
        sb.append(queue.poll());
        sb.append('>');

        System.out.println(sb);
     
    }
}
