import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1260
{

    public static void dfs (ArrayList<ArrayList<Integer>> array, int node, int[] visited) {
        if (visited[node] == 1) return;
        visited[node] = 1;

        System.out.printf("%d \n", node);

        for (int next : array.get(node))
        {
            dfs(array, next, visited);
        }
    }

    public static void DFS(ArrayList<ArrayList<Integer>> array, int V, int [] visited, Stack<Integer> st)
    {
        visited[V]++;
        st.add(V);
        System.out.print(V + " ");

        while (!st.isEmpty())
        {
            int cursor = st.peek();
            int i;
            for(i = 0; i < array.get(cursor).size(); i++)
            {
                if(visited[array.get(cursor).get(i)] == 0) //갈 수 있는 노드가 없으면 i == array.get(cursor).size()
                {
                    break;
                }
            }

            if(i == array.get(cursor).size()) //더이상 갈 노드가 없을 경우 stack에서 빼기.
            {
                st.pop();
            }
            else
            {
                System.out.print(array.get(cursor).get(i) + " ");
                st.add(array.get(cursor).get(i));
                visited[array.get(cursor).get(i)]++;
            }


        }
    }

    public static void BFS(ArrayList<ArrayList<Integer>> array, int V, int [] visited, Queue<Integer> Q)
    {
        visited[V]++;
        Q.add(V);
        System.out.print(V + " ");

        while (!Q.isEmpty())
        {
            int cursor = Q.poll();
            for(int i = 0; i < array.get(cursor).size(); i++)
            {
                if(visited[array.get(cursor).get(i)] == 0)
                {
                    Q.add(array.get(cursor).get(i));
                    visited[array.get(cursor).get(i)]++;
                    System.out.print(array.get(cursor).get(i) + " ");
                }
            }
        }
    }
    public static void main(String[] args) throws IOException
    {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        ArrayList <ArrayList<Integer>> adj = new ArrayList<>(); //graph를 저장할 2차원 배열
        int [] visited1 = new int [N + 1]; // 방문한 노드를 기록할 1차원 배열
        int [] visited2 = new int [N + 1]; // 방문한 노드를 기록할 1차원 배열
        Queue<Integer> myQueue = new LinkedList<Integer>(); // BFS를 구현할 queue
        Stack<Integer> myStack = new Stack<Integer>(); // DFS를 구현할 stack

        for(int i = 0; i < N + 1; i++)
        {
            adj.add(new ArrayList<>()); //껍데기만 생성되어 있기에 실질적으로 생성해주기.
        }
        // adj[1] = {2, 3, 4 ...} <- 이런식으로 저장해야함. 같은 값이 중복되지 않게!
        for(int i = 0; i < M; i++)
        {
            st = new StringTokenizer(bf.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            if(!adj.get(num1).contains(num2))
            {
                adj.get(num1).add(num2);
            }
            if(!adj.get(num2).contains(num1))
            {
                adj.get(num2).add(num1);
            }

        }
        for(int i = 0; i < N + 1; i++)
        {
            adj.get(i).sort(Comparator.naturalOrder());
        }
        DFS(adj, V, visited1, myStack);
        System.out.println();
        BFS(adj, V, visited2, myQueue);
    }
}