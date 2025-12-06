class Solution {
    public String solution(int n, int t, int m, int p) {
        char[] digits = "0123456789ABCDEF".toCharArray();

        // n진수 변환 함수
        java.util.function.IntFunction<String> convert = (num) -> {
            if (num == 0) return "0";
            StringBuilder sb = new StringBuilder();
            int temp = num;
            while (temp > 0) {
                sb.append(digits[temp % n]);
                temp /= n;
            }
            return sb.reverse().toString();
        };

        // 전체 숫자 이어붙이기
        StringBuilder total = new StringBuilder();
        int num = 0;
        while (total.length() < t * m) {
            total.append(convert.apply(num));
            num++;
        }

        // 튜브가 말해야 하는 문자만 추출
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < t; i++) {
            answer.append(total.charAt(i * m + (p - 1)));
        }

        return answer.toString();
    }
}
