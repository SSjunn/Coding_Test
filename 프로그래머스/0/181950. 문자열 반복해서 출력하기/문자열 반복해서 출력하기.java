import java.util.*;

/*
str -> 문자
공백 전까지 읽어야 해서 sc.next();
n -> 정수
반복문 for

한 줄 출력 -> print()
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =  sc.next();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.print(str);
        }
    }
}