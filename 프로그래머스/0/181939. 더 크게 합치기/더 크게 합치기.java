/*
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int result1 = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int result2 = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        answer = (result2 <= result1) ? result1 : result2;
        return answer;
    }
}
*/

class Solution{
    public int solution(int a, int b){
        String case1 = (String.valueOf(a) + String.valueOf(b));
        String case2 = (String.valueOf(b) + String.valueOf(a));
        
        int case1_i = Integer.valueOf(case1);
        int case2_i = Integer.valueOf(case2);
        
        int result = (case1_i>case2_i) ? case1_i : case2_i;
        
        return result;
    }
}
