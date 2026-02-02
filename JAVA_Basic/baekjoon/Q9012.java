import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;


public class Q9012 {
    public static void main(String[] args) throws IOException
    {
        Stack<Integer> stack = new Stack<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        String str = new String();

        boolean VPS = true;

        for(int i = 0; i < T; i++)
        {
            stack.clear();
            str = bf.readLine();
            VPS = true;

            for(int j = 0; j < str.length(); j++)
                {
                    if(str.charAt(j) == '(')
                    {
                        stack.push(1);
                    }
                    else if(str.charAt(j) == ')')
                    {
                        if(stack.isEmpty())
                        {
                            VPS = false;
                            break;
                        }
                        else
                        {
                            stack.pop();
                        }
                    }
                }
            if(stack.size() != 0)
                {
                    VPS = false;
                }    
            
            if(VPS == true)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
