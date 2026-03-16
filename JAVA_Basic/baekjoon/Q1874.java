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
        int N = Integer.parseInt(bf.readLine());
        int start = 1; // stack에 들어갈 수

        for(int i = 0; i < N; i++)
        {
            int input = Integer.parseInt(bf.readLine());

            while(start <= input)
            {
                stack.add(start);
                start++;
                sb.append("+");
                sb.append("\n");
            }

            if(stack.peek() == input)
            {
                stack.pop();
                sb.append("-");
                sb.append("\n");
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
/*
start보다 작은수가 input이어도 

*/