import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int left = 1, right = 1;
        int sum = 1;
        int count = 0;

        while (left <= N) {

            if (sum == N) {      // 정답 하나 발견
                count++;
                sum -= left;
                left++;
            }
            else if (sum < N) {  // sum을 키우기 위해 구간 확장
                right++;
                sum += right;
            }
            else {               // sum > N → 구간 줄이기
                sum -= left;
                left++;
            }
        }

        System.out.println(count);
    }
}
