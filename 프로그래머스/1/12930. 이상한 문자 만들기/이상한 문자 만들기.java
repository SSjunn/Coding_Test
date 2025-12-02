 class Solution {
        public String solution(String s) {
            String answer = "";
            int idx = 0; // 단어별 인덱스

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (ch == ' ') {
                    answer += " ";
                    idx = 0;    // 공백일 때 단어 인덱스 초기화
                    continue;
                }

                if (idx % 2 == 0) {
                    answer += Character.toUpperCase(ch);
                } else {
                    answer += Character.toLowerCase(ch);
                }

                idx++;
            }
            return answer;
        }
    }