import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Q14626{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String st = bf.readLine();
        
        int sum = 0;
        int starWeight = 0; 


        for (int i = 0; i < 13; i++) 
            {
            
            int weight = (i % 2 == 0) ? 1 : 3; 

            if (st.charAt(i) == '*') {
                starWeight = weight;
            } else {
                sum += (st.charAt(i) - '0') * weight;
            }
        }

        for (int i = 0; i <= 9; i++) 
            {
            
            if ((sum + i * starWeight) % 10 == 0) 
                {
                System.out.println(i);
                break;
                }
        }
    }
}
