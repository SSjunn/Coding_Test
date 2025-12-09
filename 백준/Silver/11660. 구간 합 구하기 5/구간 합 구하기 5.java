import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    // BufferedReader 를 사용해서 런타임에러 잡고
    // 입력 스트림 실패 가능하니까 예외처리 해.
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 공백 기준 잘라
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] A = new int[N + 1][N + 1];
        int[][] D = new int[N + 1][N + 1];

        // 원본 배열 입력
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 2차원 누적합 생성
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                D[i][j] = D[i - 1][j] + D[i][j - 1] - D[i - 1][j - 1] + A[i][j];
            }
        }
        // 메모리 모았다가 한번에 보내
        StringBuilder sb = new StringBuilder();

        // 질의 처리
        while (M > 0) {
            M--;
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int sum = D[x2][y2]
                    - D[x1 - 1][y2]
                    - D[x2][y1 - 1]
                    + D[x1 - 1][y1 - 1];

            sb.append(sum).append('\n');
        }

        System.out.print(sb);
    }
}