import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q1620
{
    public static void main(String args[]) throws IOException
    {
        HashMap<String, Integer> pokemon = new HashMap<>();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] arr = new String[N + 1];
        String input;

        for(int i = 1; i < N + 1; i++)
        {
            input = bf.readLine();
            
            pokemon.put(input,i);
            arr[i] = input;
        }

        for(int i = 0; i < M; i++)
        {
            input = bf.readLine();

            if(Character.isDigit(input.charAt(0)))
            {
                System.out.println(arr[Integer.parseInt(input)]);
            }
            else
            {
                System.out.println(pokemon.get(input));

            }
        }




    }
}