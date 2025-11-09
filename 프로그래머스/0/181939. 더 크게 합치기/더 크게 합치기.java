class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int result1 = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int result2 = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        answer = (result2 <= result1) ? result1 : result2;
        return answer;
    }
}