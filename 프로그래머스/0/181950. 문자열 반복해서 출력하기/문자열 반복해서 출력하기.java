import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // 문자열 입력
        int n = sc.nextInt(); // 반복횟수
        
        String result = ""; //문자열 변수 초기화
        
        for (int i =0;  i<n; i++){
            result +=str;
        }
        
        
        System.out.println(result);
    }
}