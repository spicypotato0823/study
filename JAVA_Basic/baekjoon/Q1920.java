import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1920 {
    public static void main(String[] args) throws IOException 
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());

        for (int i = 0; i < n; i++) 
            {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        int m = Integer.parseInt(bf.readLine());
        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) 
            {
            int target = Integer.parseInt(st2.nextToken());
            int left = 0;
            int right = n - 1;
            int p = 0;
            int t;

            while (left <= right) { 
                t = (left + right) / 2;

                if (arr[t] > target) {
                    right = t - 1;
                } 
                else if (arr[t] < target) {
                    left = t + 1;
                } 
                else {
                    p = 1; 
                    break;
                }
            }
            
            sb.append(p).append("\n");
        }
        
        System.out.println(sb);
    }    
}