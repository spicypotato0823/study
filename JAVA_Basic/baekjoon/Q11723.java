import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11723 
{
    public static void add(int[] arr, int x)
    {
        arr[x] = 1;
    }
    public static void remove(int[] arr, int x)
    {
        arr[x] = 0;
    }
    public static int check(int[] arr, int x)
    {
      return arr[x];
    }
    public static void toggle(int[] arr, int x)
    {
        if(arr[x] == 0)
        {
            arr[x] = 1;
        }
        else
        {
            arr[x] = 0;
        }
    }
    public static void all(int[] arr)
    {
        for(int i = 1; i < arr.length; i++)
        {
            arr[i] = 1;
        }
    }
    public static void empty(int[] arr)
    {
        for(int i = 1; i < arr.length; i++)
        {
            arr[i] = 0;
        }
    }
    public static void main(String[] args)  throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        int [] num = new int[21];
        for(int i = 0; i < M; i++)
        {
            
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            String input = st.nextToken();

            switch (input) 
            {
                case "add":
                    add(num, Integer.parseInt(st.nextToken()));
                    break;
                case "remove":
                    remove(num, Integer.parseInt(st.nextToken()));
                    break;
                case "check":
                    sb.append(check(num, Integer.parseInt(st.nextToken())));
                    sb.append("\n");
                    break;
                case "toggle":
                    toggle(num, Integer.parseInt(st.nextToken()));
                    break;
                case "all":
                    all(num);
                    break;
                case "empty":
                    empty(num);
                    break;
            }
        }
        System.out.println(sb);
        
    }    
}
