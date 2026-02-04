import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.TreeSet;
import java.util.Collections;
import java.util.StringTokenizer;


public class Q7785
{
    public static void main(String[] args) throws IOException
    {
        StringBuilder sb = new StringBuilder();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> set = new TreeSet<>(Collections.reverseOrder());
        int N = Integer.parseInt(bf.readLine());
        String name;

        for(int i = 0; i < N; i++)
        {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            name = st.nextToken();
            if(st.nextToken().equals("enter"))
            {
                set.add(name);
            }
            else
            {
                set.remove(name);
            }
        }

        for(String n : set)
        {
            sb.append(n).append("\n");
        
        }

        System.out.println(sb);
    }
}