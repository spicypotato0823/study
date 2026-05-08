import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class aoj {

    public static class Stack
    {
        private char[] arr;
        private int top;

        public Stack()
        {
            arr = new char[100];
            top = -1;
        }
        public boolean isEmpty()
        {
            return top == -1;
        }

        public void push(char item)
        {
            top++;
            arr[top] = item;
        }

        public char pop()
        {
            if(top == -1) return 'e';

            char returnChar = arr[top];
            top--;
            return returnChar;
        }

        public char peek()
        {
            if(top == -1) return 'e';

            return arr[top];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        int count = 0;
        Stack st = new Stack();

        for(int i = 0; i < N; i++)
        {
            if(str.charAt(i) == 'A')
            {
                if(st.peek() == 'N') // 이미 stack에 AN이 들어가 있음
                {
                    st.pop();
                    count++;
                }
                else if(st.peek() == 'F')
                {
                    st.pop();
                    st.pop();
                }

                else if(st.isEmpty()) st.push(str.charAt(i)); // stack에 들어가 있는 것이 없음
            }

            else if(str.charAt(i) == 'N')
            {
                if(st.peek() == 'A') st.push(str.charAt(i));

                else if(st.peek() == 'N') st.push('F');
            }
        }
        System.out.println(count);

    }
}