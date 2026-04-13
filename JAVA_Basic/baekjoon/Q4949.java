import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4949
{
    public static class Stack
    {
        int [] arr = new int[200];
        int top;
        int size;

        public Stack()
        {
            top = -1;
            size = 0;
        }

        public void add(int item)
        {
            top++;
            arr[top] = item;
            size++;
        }
        public int peek()
        {
            if(size == 0) return -1;

            else return arr[top];
        }
        public void pop()
        {
            if(top == -1) return;

            else
            {
                int n = arr[top];
                top--;
                size--;
            }
        }
    }

    public static void main(String []args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();
        while (line != null)
        {
            Stack st = new Stack();

            int i = 0;
            char c = line.charAt(i);
            if(c == '.')
            {
                break;
            }

            while(c != '.')
            {
                if(c == '(') st.add(1);

                else if (c == '[') st.add(2);

                else if (c == ')')
                {
                    if(st.peek() != 1)
                    {
                        st.add(-1);
                        break;
                    }

                    else st.pop();

                }
                else if (c == ']')
                {
                    if(st.peek() != 2)
                    {
                        st.add(-1);
                        break;
                    }

                    else st.pop();
                }
                i++;
                c = line.charAt(i);
            }

            if(st.size != 0) System.out.println("no");

            else System.out.println("yes");

            line = bf.readLine();
        }

    }
}