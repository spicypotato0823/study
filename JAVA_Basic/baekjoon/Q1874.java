import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1874 
{
    public static void main(String[] args) throws IOException
    {

        StringBuilder sb = new StringBuilder();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int start = 1; // stack에 들어갈 수
        
        int n = Integer.parseInt(bf.readLine());

        for(int i = 0; i < n; i++)
        {
            int input = Integer.parseInt(bf.readLine());

            while(start <= input)
            {
                stack.push(start);
                start++;
                sb.append("+\n");
            }

            if(stack.peek() == input)
            {
                sb.append("-\n");
                stack.pop();
            }
            else
            {
                sb = new StringBuilder();
                sb.append("NO");
                break;
            }
        }
       
        System.out.println(sb);
    }
}    
