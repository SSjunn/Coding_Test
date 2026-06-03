import java.util.Scanner;

/*
    str 문자열 하나씩 쪼개.
    소문자면 uppercase 대문자면 lowercase
*/

/*
방법 1 -> 배열로 사용

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split("");
        // System.out.println(arr);
        
        for (String i : arr){
            if(i.toUpperCase().equals(i)){
                System.out.print(i.toLowerCase());
            } else {
                System.out.print(i.toUpperCase());
            }
        }
    }
}
*/

//방법 2
// 문자열 char 배열로 쪼개는 함수 str.tocharArray()
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        for (char c : str.toCharArray()) {  // 문자열 → char 배열로 쪼개기
            if (Character.isLowerCase(c)) {
                System.out.print(Character.toUpperCase(c));  // 소문자 → 대문자
            } else {
                System.out.print(Character.toLowerCase(c));  // 대문자 → 소문자
            }
        }
    }
}

/*
// 방법3

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b;
        String answer = "";
        
        for (int i = 0; i<a.length(); i++ ){
            b = a.charAt(i);
            // charAt() : 문자열에서 문자하나만 가져오는 함수
            
            if(Character.isUpperCase(b)){
            // Character.isUpperCase() : 대문자 인지 확인
            answer +=Character.toLowerCase(b);
            // Character.toUpperCase() : 소문자 변환
            }
        
            else{
            // Character.isLowerCase() : 소문자 인지 확인
            answer +=Character.toUpperCase(b);
            }
        }
        System.out.println(answer);
    }
}
*/