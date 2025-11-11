/*
    mode 0 or 1
    code를 쭉 읽어
        문자가 1이면 mode 바꿔(0-> 1 or 1->0)
        문자가 1이 아니면
            mode = 0 idx가 짝수일때만 문자 추가
            mode = 1 idx가 홀수일때만 문자 추가
*/
class Solution {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0;
        
        for(int i = 0; i<code.length(); i++){
            char c = code.charAt(i);
            
            if (c=='1'){
                mode = 1 - mode;
            }else{
                if (mode == 0 && i%2 == 0){
                    ret.append(c);
                }else if (mode == 1 && i%2 == 1){
                    ret.append(c);
                }
            }
        }
        if (ret.length() == 0)return "EMPTY";
        return ret.toString();
    }
}