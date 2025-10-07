import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumBorders {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // number of test cases

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            char[][] grid = new char[R][C];

            for (int i = 0; i < R; i++) {
                grid[i] = br.readLine().toCharArray();
            }

            int maxBorder = 0;

            // Check rows
            for (int i = 0; i < R; i++) {
                int count = 0;
                for (int j = 0; j < C; j++) {
                    if (grid[i][j] == '#') {
                        count++;
                        maxBorder = Math.max(maxBorder, count);
                    } else {
                        count = 0;
                    }
                }
            }

            // Check columns
            for (int j = 0; j < C; j++) {
                int count = 0;
                for (int i = 0; i < R; i++) {
                    if (grid[i][j] == '#') {
                        count++;
                        maxBorder = Math.max(maxBorder, count);
                    } else {
                        count = 0;
                    }
                }
            }

            System.out.println(maxBorder);
        }
    }
}
