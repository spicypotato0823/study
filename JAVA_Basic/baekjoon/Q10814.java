import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10814
{
    public static class member //구조체 만들기
    {
        private int age;
        private String name;

        member(int age, String name)
        {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        member[] N = new member[n]; // 구조체 배열 선언 시

        for(int i = 0; i < n; i++)
        {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            N[i] = new member(Integer.parseInt(st.nextToken()), st.nextToken()); // 하나하나 new 해줘야한다!
        }
        Arrays.sort(N, (m1 , m2) -> m1.age - m2.age); // 자바의 개쩌는 lambda;;;

        for(int i = 0; i < n; i++)
        {
            System.out.println(N[i].age + " " + N[i].name);
        }
    }
}