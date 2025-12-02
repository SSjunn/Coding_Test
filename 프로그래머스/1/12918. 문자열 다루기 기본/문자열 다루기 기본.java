class Solution {
        public boolean solution(String s) {
            if(s.length() != 4 && s.length() != 6){
                return false;
            }
            for(int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                // 숫자가 아니면 false
                // 혹시 숫자가 들어간거만 찾는다면 && 적는거다.
                if(c < '0' || c > '9') {
                    return false;
                }
            }

            return true;  // 모두 숫자면 true
        }
    }