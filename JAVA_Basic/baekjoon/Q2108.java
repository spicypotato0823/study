import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2108
{
    public static long ArithmeticMean(int [] arr, int n)
    {
        double sum = 0;
        for(int i = 0; i < 8001; i++)
        {
            sum += (i - 4000) * arr[i];
        }

        return Math.round(sum / n);
    }

    public static int median(int [] arr, int n)
    {
        int count = 0;
        int i = 0;
        int returnValue = 0;

        while (count <= n / 2)
        {
            if(arr[i] != 0)
            {
                count += arr[i];
                returnValue = i - 4000;
            }

            i++;
        }
        return returnValue;
    }

    public static int mode(int [] arr)
    {
        int max = -1;
        int maxIndex = 0;
        boolean t = false;
        for(int i = 0; i < 8001; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
                maxIndex = i - 4000;
                t = false;
            }
            else if (max == arr[i] && !t)
            {
                t = true;
                maxIndex = i - 4000;
            }
        }
        return maxIndex;
    }

    public static int range(int [] arr)
    {
        int max = -1;
        int min = 9999;

        for(int i = 0; i < 8001; i++)
        {
            if(arr[i] != 0)
            {
                if(min > i)
                {
                    min = i;
                }
                if(max < i)
                {
                    max = i;
                }
            }
        }

        return max - min;
    }

    public static void main(String [] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int [] countingArr = new int[8001];
        for(int i = 0; i < N; i++)
        {
            countingArr[Integer.parseInt(bf.readLine()) + 4000]++;
        }

        System.out.println(ArithmeticMean(countingArr, N));
        System.out.println(median(countingArr, N));
        System.out.println(mode(countingArr));
        System.out.println(range(countingArr));

    }
}