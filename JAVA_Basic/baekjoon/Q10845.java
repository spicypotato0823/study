import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Q10845
{
    public static class MyQueue {
        private int size = 10000;
        private int[] queue = new int[size];
        private int front = 0;
        private int rear = 0;

        public void push(int X) {
            queue[front] = X;
            front++;
        }

        public int pop() {
            if (getSize() == 0)
            {
                return -1;
            } else
            {
                int x = queue[rear];
                rear++;
                return x;
            }
        }

        public int getSize() {
            return front - rear;
        }

        public int empty() {
            if (getSize() == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        public int getFront() {
            if (getSize() == 0) {
                return -1;
            } else {
                return queue[rear];
            }
        }

        public int getRear() {
            if (getSize() == 0) {
                return -1;
            } else {
                return queue[front - 1];
            }
        }
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        MyQueue Q = new MyQueue();

        for(int i = 0; i < N; i++)
        {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String input = st.nextToken();

            switch (input) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    Q.push(num);
                    break;
                case "pop":
                    System.out.println(Q.pop());
                    break;
                case "size":
                    System.out.println(Q.getSize());
                    break;
                case "empty":
                    System.out.println(Q.empty());
                    break;
                case "front":
                    System.out.println(Q.getFront());
                    break;
                case "back":
                    System.out.println(Q.getRear());
                    break;
            }
        }

    }
}