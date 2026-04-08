import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q25206
{
    public static void main(String []args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double sum_grade = 0;
        double sum_credit = 0;
        for(int i = 0; i < 20; i++)
        {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            double grade = 0;
            switch (st.nextToken())
            {
                case "A+":
                    grade = 4.5;
                    break;
                case "A0":
                    grade = 4.0;
                    break;
                case "B+":
                    grade = 3.5;
                    break;
                case "B0":
                    grade = 3.0;
                    break;
                case "C+":
                    grade = 2.5;
                    break;
                case "C0":
                    grade = 2.0;
                    break;
                case "D+":
                    grade = 1.5;
                    break;
                case "D0":
                    grade = 1.0;
                    break;
                case "F":
                    grade = 0;
                    break;
                case "P":
                    credit = 0;
                    grade = 0;
                    break;
            }
            sum_grade += credit * grade;
            sum_credit += credit;
        }

        System.out.println(sum_grade / sum_credit);
    }
}