/*
    my_string [] 만들어서 index
    overwrite_string[] 만들어서 index
    s에index 부여해서 바꾸기
    아닌가?
    my_sting - over 해주고 index 변경 함수 쓰면 되는거 같은데
*/
/*
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String changed = "";
        int longer = overwrite_string.length()+s;
        changed = (my_string.substring(0,s))+
                          overwrite_string+
                          my_string.substring(longer,my_string.length());
        return changed;
    }
}
*/

public class Solution{
    public String solution(String my_string, String overwrite_string, int s){
        
        int ml = my_string.length();
        int ol = overwrite_string.length();
        
        
        String answer = my_string.substring(0,s) + overwrite_string + my_string.substring(s+ol);
        
        System.out.println(answer);
        return answer;
    }
}

/*
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String my_string = sc.nextLine();
        String overwrite_string = sc.nextLine();
        
        System.out.print("시작할 위치(숫자) 입력: ");
        int s = sc.nextInt();
        
        int ol = overwrite_string.length();
        
        String answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s + ol);
        
        System.out.println("최종 결과: " + answer);
    }
}
*/