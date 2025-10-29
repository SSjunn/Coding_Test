import java.util.Scanner;
/*
    n : 횟수
    nNum : 문자열
    sum : 각 자리 합
    Scanner
    반복
       각 자리 배열에 넣어 
*/
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt(); //
        String nNum = scan.next(); // 문자열 입력
        String [] nNumArr; // 배열 
        int sum = 0;
        
        
        nNumArr = nNum.split(""); // 문자열을 한 글자씩 잘라서 넣어.
        
        for(int i =0; i<nNumArr.length; i++){
            sum += Integer.parseInt(nNumArr[i]);
        }
        System.out.println(sum);
    }
}