import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
    // readLine() 에 대한 예외 처리 넣어주고
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 재료, 고유번호
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 배열에 저장
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        // 오름 차순 정리
        Arrays.sort(A);
        int count = 0;
        int i = 0; //MIN
        int j = N-1; //MAX

        while(i<j){
            if(A[i] + A[j] > M){
                j--;
            }else if(A[i] + A[j] < M){
                i++;
            }else{
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);
    }
}