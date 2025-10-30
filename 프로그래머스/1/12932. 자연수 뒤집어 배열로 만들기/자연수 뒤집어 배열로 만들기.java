class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n); // long → 문자열 변환
        String[] strArr = str.split(""); // 한 글자씩 자르기
        int[] answer = new int[strArr.length]; // 결과 배열 생성

        // 문자열을 숫자로 변환해서 배열에 넣기 (순서는 그대로)
        for (int i = 0; i < strArr.length; i++) {
            answer[i] = Integer.parseInt(strArr[i]);
            
        } // 12345
        for (int i = str.length() - 1; i >= 0; i--) { // answer[i] = 54321
            answer[str.length() -1 - i] = Integer.parseInt(strArr[i]);
        }

        return answer;
    }
}
