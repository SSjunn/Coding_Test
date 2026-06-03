import java.util.Scanner;
/*
Scanner 입력 메서드 종류

nextLine() -> 한 줄 전체를 읽음(공백 포함)
next() -> 공백 전까지 단어 하나 읽기
nextInt() -> 정수 읽기
nextLong() -> 큰 정수 읽기
nextDouble() -> 실수 읽기
nextBoolean() -> true/false 읽기
*/
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
    }
}