import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q10828
{
    public static void main(String[] args) throws IOException
    {
        Stack<Integer> stack = new Stack<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        for(int i = 0; i < n; i++)
        {
            String input;
            input = bf.readLine();

            StringTokenizer st = new StringTokenizer(input);
            String a = st.nextToken();

            if(a.equals("push"))
            {
                int num = Integer.parseInt(st.nextToken());
                stack.push(num);
            }
            else if(a.equals("pop"))
            {
                if(stack.isEmpty())
                {
                    System.out.println(-1);
                }
                else
                {
                System.out.println(stack.pop());
                }
            }
            else if(a.equals("size"))
            {
                System.out.println(stack.size());
            }
            else if(a.equals("empty"))
            {
                if(stack.isEmpty())
                {
                    System.out.println(1);
                }
                else
                {
                    System.out.println(0);

                }
            }
            else if(a.equals("top"))
            {
                if(stack.isEmpty())
                {
                    System.out.println(-1);
                }
                else
                {
                System.out.println(stack.peek());
                }
            }
        }
       
    }


}