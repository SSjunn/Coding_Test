
/*
    x로 0 제거 replace("0","");
    남은 숫자를 2진법으로 변환
*/
class Solution {
    public int[] solution(String s) {

        int count = 0;          // 이진 변환 횟수
        int removedZero = 0;   // 제거한 0의 총 개수
        String start = s;     // 시작 문자열

        while (start.length() > 1) {   // "1"이 될 때까지 반복

            count++;

            // 0 제거 개수 세기
            int zeroCount = 0;
            for (int i = 0; i < start.length(); i++) {
                if (start.charAt(i) == '0') zeroCount++;
            }
            removedZero += zeroCount;

            // 0 제거
            String x = start.replace("0", ""); 
            int num = x.length();         

            // 2진수 바꿔
            String tmp = "";
            while (num > 0) {
                tmp += (num % 2);
                num /= 2;
            }

            // 정방향
            StringBuffer sb = new StringBuffer(tmp);
            sb.reverse();

            start = sb.toString();
        }

        return new int[]{count, removedZero};
    }
}


