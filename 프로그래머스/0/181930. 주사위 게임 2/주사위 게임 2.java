/*
 abc 달라 => a+b+c
 세 숫자 중 1개만 달라 => (a+b+c)*(a*a + b*b + c*c) a랑b 같고 c 달라 ac 같고 b 달라
 abc 같아 => (a+b+c)*(a*a + b*b + c*c)
*/
class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if (a != b && b != c && a != c){
            answer = a+b+c;
        }else if(((a == b && a != c)||
            (a == c && a != b)||
            (b == c && b != a)
           )){
            answer = (a+b+c)*(a*a + b*b + c*c);
        }else{
            answer = (a+b+c)*(a*a + b*b + c*c)*((a*a*a)+(b*b*b)+(c*c*c));
        }
        return answer;
    }
}