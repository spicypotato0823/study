import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;



public class Q10773  
{
    public static void main(String[] args) throws IOException
    {
        Stack<Integer> stack = new Stack<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int k;
        int input;
        int sum = 0;
        k = Integer.parseInt(bf.readLine());

        for(int i = 0; i < k; i++)
        {
            input = Integer.parseInt(bf.readLine());
            if(input == 0)
            {
                stack.pop();
            }
            else
            {
                stack.push(input);
            }
        }

        for(int n : stack)
        {
            sum += n;
        }
        System.out.println(sum);
    }    
}
