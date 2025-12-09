class Solution {
    boolean solution(String s) {
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            } else {
                count--;
            }

            // 중간에 닫는 괄호가 더 많아지면 올바르지 않음
            if (count < 0) return false;
        }

        // 모두 처리했을 때 열림 괄호가 남아 있지 않아야 함
        return count == 0;
    }
}