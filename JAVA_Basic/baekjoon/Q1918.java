import java.io.*;
import java.util.EmptyStackException;
import java.util.StringTokenizer;

public class Q1918
{
    public static class Node <E>
    {
        private E item;
        private Node<E> next;
        public Node(E newItem, Node<E> node)
        {
            item = newItem;
            next = node;
        }

        public E getItem() {return item;}
        public Node<E> getNext() {return next;}
        public void setItem(E newItem) {item = newItem;}
        public void setNext(Node<E> newNext) {next = newNext;}
    }

    public static class ListStack <E>
    {
        private Node<E> top;
        private int size;
        public ListStack()
        {
            top = null;
            size = 0;
        }
        public int size() {return size;}
        public boolean isEmpty() {return size == 0;}

        public void push(E newItem)
        {
            Node<E> newNode = new Node<>(newItem, top);
            top = newNode;
            size++;
        }
        public E pop()
        {
            if(isEmpty()) {
                throw new EmptyStackException();
            }
            E returnItem = top.getItem();
            top = top.getNext();
            size--;
            return returnItem;

        }
        public E peek()
        {
            if(isEmpty())
            {
                throw new EmptyStackException();
            }
            return top.getItem();
        }
    }

    public static int compareOperator(char op1, char op2)
    {
        int op1Num = 0;
        int op2Num = 0;

        if(op1 == ('*') || op1 == ('/')) op1Num = 2;

        else if(op1 == ('+') || op1 == ('-')) op1Num = 1;

        if(op2 == ('*') || op2 == ('/')) op2Num = 2;

        else if(op2 == ('+') || op2 == ('-')) op2Num = 1;

        return op1Num - op2Num;
    }

    public static void calc_infix(String s)
    {
        ListStack<Character> operatorList = new ListStack<Character>();

        int size = s.length();

        for(int i = 0; i < size; i++)
        {
            char input = s.charAt(i);
            int p;

            if(input == ('(')) operatorList.push('(');

            else if(input == (')'))
            {
                while(!operatorList.peek().equals('('))
                {
                    System.out.print(operatorList.pop());
                }
                operatorList.pop();
            }
            else if(input == ('*'))
            {
                if(!operatorList.isEmpty())
                {
                    if(compareOperator(input, operatorList.peek()) > 0)
                    {
                        operatorList.push('*');
                    }
                    else
                    {
                        System.out.print(operatorList.pop());
                        operatorList.push('*');
                    }
                }
                else
                {
                    operatorList.push('*');
                }
            }
            else if(input == ('/'))
            {
                if(!operatorList.isEmpty())
                {
                    if(compareOperator(input, operatorList.peek()) > 0)
                    {
                        operatorList.push('/');
                    }
                    else
                    {
                        System.out.print(operatorList.pop());
                        operatorList.push('/');
                    }
                }
                else
                {
                    operatorList.push('/');
                }
            }
            else if(input == ('+'))
            {
                if(!operatorList.isEmpty())
                {
                    if(compareOperator(input, operatorList.peek()) > 0)
                    {
                        operatorList.push('+');
                    }
                    else
                    {
                        while (compareOperator(input, operatorList.peek()) <= 0)
                        {
                            System.out.print(operatorList.pop());
                            if (operatorList.isEmpty()) break;
                        }
                        operatorList.push('+');
                    }
                }
                else
                {
                    operatorList.push('+');
                }
            }
            else if(input == ('-'))
            {
                if(!operatorList.isEmpty())
                {
                    if(compareOperator(input, operatorList.peek()) > 0)
                    {
                        operatorList.push('-');
                    }
                    else
                    {
                        while (compareOperator(input, operatorList.peek()) <= 0)
                        {
                            System.out.print(operatorList.pop());
                            if (operatorList.isEmpty()) break;

                        }
                        operatorList.push('-');
                    }
                }
                else
                {
                    operatorList.push('-');
                }
            }
            else
            {
                System.out.print(input);
            }
        }

        while(!operatorList.isEmpty())
        {
            System.out.print(operatorList.pop());
        }
        return;
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        calc_infix(bf.readLine());

    }
}
