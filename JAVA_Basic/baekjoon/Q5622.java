import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Q5622
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String st = bf.readLine();
        
        int sum = 0;
        int [] arr = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
        
        for(int i = 0; i < st.length(); i++)
        {
            sum += arr[st.charAt(i) - 'A'];    

        }

        System.out.println(sum);
    }
}