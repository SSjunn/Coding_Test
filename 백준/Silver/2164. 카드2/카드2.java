import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        int N = sc.nextInt();

        // 1번 카드부터 N번 카드까지
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            queue.poll();            // 맨 위 카드 버림
            queue.add(queue.poll()); // 다음 카드 맨 아래로
        }

        System.out.println(queue.poll());
    }
}
