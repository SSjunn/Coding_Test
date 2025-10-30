/*
    my_string [] 만들어서 index
    overwrite_string[] 만들어서 index
    s에index 부여해서 바꾸기
    아닌가?
    my_sting - over 해주고 index 변경 함수 쓰면 되는거 같은데
*/
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String changed = "";
        int longer = overwrite_string.length()+s;
        changed = (my_string.substring(0,s))+
                          overwrite_string+
                          my_string.substring(longer,my_string.length());
        return changed;
    }
}