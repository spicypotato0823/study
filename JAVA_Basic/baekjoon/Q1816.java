import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1816
{
  public static void main(String[] arg) throws IOException
  {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(bf.readLine());

    for(int i = 0; i < N; i++)
    {
      long num = Long.parseLong(bf.readLine());
      int j;
      for (j = 2; j <= 1000000; j++)
      {
        if(num % j == 0)
        {
          break;
        }
      }
      if(j == 1000001)
      {
        System.out.println("YES");
      }
      else
      {
        System.out.println("NO");
      }
    }
  }
}