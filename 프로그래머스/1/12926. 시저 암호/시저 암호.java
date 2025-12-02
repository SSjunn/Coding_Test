class Solution {
        public String solution(String s, int n) {
            String answer = "";
            for(int i = 0; i<s.length(); i++) {
                char ch = s.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {  // 대문자
                    ch = (char)((ch - 'A' + n) % 26 + 'A');
                }
                else if (ch >= 'a' && ch <= 'z') { // 소문자
                    ch = (char)((ch - 'a' + n) % 26 + 'a');
                }
                else if (ch == ' ') { // 공백
                    // 공백은 그대로
                }
                answer += ch;
            }
            return answer;
        }
    }