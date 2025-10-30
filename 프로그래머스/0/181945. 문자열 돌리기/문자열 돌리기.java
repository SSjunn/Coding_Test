import java.util.Scanner;

/*
    str 문자열
    배열에 하나씩 담아서
    for 문 반복으로 index 하나씩 출력
*/
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] aArr = a.split("");
        for (int i =0; i<aArr.length; i++){
            System.out.println(aArr[i]);
        }
        }
    }