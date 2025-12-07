/*
    점수 중 최대값 max() 구하기 = M
    나머지 점수로 점수/M*100 => 이럴거면 Arrays.sort() 사용
    출력 결과 전부다 doubel 형태 쓰고 avg double 형태로 받아.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] arr = new double[N];

        double max = 0;
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextDouble();
            if(arr[i] > max) max = arr[i];
        }

        double sum = 0;
        for(int i = 0; i < N; i++) {
            sum += (arr[i] / max) * 100;
        }

        System.out.println(sum / N);
    }
}
