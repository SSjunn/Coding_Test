/*
    w => +1
    s => -1
    d => +10
    a => -10
    class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        for(int i = 0; i<control.length; i++){
            if(control = w){
                int count_w++;
                answer += (count_s*1)
            }else if (control = s){
                int count_s++;
                answer += (count_s*-1)
            }else if (control = d){
                answer += (count_s*10)
            }else if (control =a){
                answer += (count_s*-10)
            }else{
                break;
            }
                
        }
        return answer;
    }
}
    class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        for (int i = 0; i < control.length(); i++) {
            char c = control.charAt(i);
            
            if (c == 'w') {
                answer += 1;
            } else if (c == 's') {
                answer -= 1;
            } else if (c == 'd') {
                answer += 10;
            } else if (c == 'a') {
                answer -= 10;
            }
        }
        
        return answer;
    }
}

*/
 class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        for (int i = 0; i < control.length(); i++) {
            char c = control.charAt(i);
            
            if (c == 'w') {
                answer += 1;
            } else if (c == 's') {
                answer -= 1;
            } else if (c == 'd') {
                answer += 10;
            } else if (c == 'a') {
                answer -= 10;
            }
        }
        
        return answer;
    }
}
