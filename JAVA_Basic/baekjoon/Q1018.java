import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1018 {
    public static int BlackFirst(char[][] board, int StartN, int StartM) {
        int count = 0;
        for (int k = 0; k < 8; k++) {
            for (int l = 0; l < 8; l++) {
                if ((l + k) % 2 == 0) {
                    if (board[StartN + k][StartM + l] != 'B') count++;
                } else {
                    if (board[StartN + k][StartM + l] != 'W') count++;
                }

            }
        }
        return count;
    }

    public static int WhiteFirst(char[][] board, int StartN, int StartM) {
        int count = 0;
        for (int k = 0; k < 8; k++) {
            for (int l = 0; l < 8; l++) {
                if ((l + k) % 2 == 0) {
                    if (board[StartN + k][StartM + l] != 'W') count++;
                } else {
                    if (board[StartN + k][StartM + l] != 'B') count++;
                }

            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] board = new char[n][m];

        for (int i = 0; i < n; i++) {
            String line = bf.readLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = line.charAt(j);
            }
        }
        int count = 9999;

        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                int temp1 = BlackFirst(board, i, j);
                int temp2 = WhiteFirst(board, i, j);
                if (count > temp1) count = temp1;
                if (count > temp2) count = temp2;
            }

        }
        System.out.println(count);
    }
}