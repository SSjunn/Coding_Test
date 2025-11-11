/*
    일단 모든 항의 등차수열을 알아야해
    1항 
    for included길이 만큼 반복{
        if(included[i] = true){
            
        }
    }
*/
class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        // 모든 항의 등차 수열 구하기
        for (int i = 0; i<included.length; i++){
            if (included[i]){
                answer += a+(i*d);
            }
        }
        return answer;
    }
}