/*
    n 짝수 홀수 체크
    if
        짝수면 1~n 중 짝수를 제곱
        홀수면 1~n 중 홀수를 더해
*/
class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n%2 == 0){
            for(int i = 2; i<=n; i+=2){
                answer += i*i;
            }
        }else{
                for(int i =1; i<=n; i+=2){
                    answer +=i;
                }
    }
        
        return answer;
    }
}