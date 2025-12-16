import java.util.Scanner;
/*
    이거 N! => 1~N까지 전부 곱해야해
    근데 이게 왜 재귀죠?
 */
public class Main {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();

        long result = 1;
        for(int i=1; i<N+1; i++){
            result *= i;
        }
        System.out.println(result);
    }
}
