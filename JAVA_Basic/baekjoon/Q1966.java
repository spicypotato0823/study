import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q1966
{
    public static void main(String []args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        for(int i = 0; i < N; i++)

        {
            StringTokenizer st = new StringTokenizer(bf.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(bf.readLine());
            ArrayList<Integer> arr = new ArrayList<>();

            int max = -1;
            int count = 0;

            for(int j = 0; j < n; j++) // 배열에 집어넣기.
            {
                int c = Integer.parseInt(st.nextToken());
                arr.add(c);

                if(c > max) // max 초기화 진행
                {
                    max = c;
                }
            }

            for(int j = 0; j < n; j++)
            {
                while (arr.get(0) != max)
                {
                    if(m == 0)
                    {
                        m = arr.size();
                    }
                    arr.add(arr.get(0));
                    arr.remove(0);
                    m--;
                }

                if(m == 0)
                {
                    count++;
                    System.out.println(count);
                    break;
                }
                m--;
                arr.remove(0);
                count++;

                max = -1;
                // max 최신화.
                for (Integer integer : arr)
                {
                    if (max <= integer)
                    {
                        max = integer;
                    }
                }
            }




        }
    }
}
/*
queue에 다 넣고 요소 중에서 처음 원소보다 더 큰 원소가 있는지 확인해야함. 확인을 어떻게 하지?
1. 배열 하나 더 만들어서 거기에 내림차순으로 정렬, peek가 배열 원소랑 같은지 보고 같을 때 까지 앞 요소를 뒤에 넣는거지 근데 내가 찾는 애가 어디로 갔는지 어떻게 파악하지;;
그니까 걍 차라리 배열에다가 저장하고 다른 원소랑 비교한 후 더 큰 원소가 있으면 뒤로 맨 뒤로 보내기
-> tracking은? m의 역할: 찾고자 하는 요소의 현 인덱스, m == 0 이라면

if(arr.getFirst() == max)
                {
                    if(m == 0)
                    {
                        System.out.println(count);
                        break;
                    }
                    arr.removeFirst();
                    count++;
                    max = -1;
                    m--;

                    for(int k = 0; k < arr.size(); k++) // max 최신화.
                    {
                        if(max < arr.get(k))
                        {
                            max = arr.get(k);
                        }
                    }
                }
                else // max == arr.getFirst가 될 때까지 arr.getFirst를 빼고 맨 뒤에 넣어야함.
                {
                    while (arr.getFirst() != max)
                    {
                        if(m == 0)
                        {
                            m = arr.size() - 1;
                        }
                        arr.add(arr.getFirst());
                        arr.removeFirst();
                        m--;
                    }
                }
*/