/*
    for(int i= 0; i<num_list 길이; i++){
        sum과 square 구하기
    }
*/
import java.util.Arrays; 
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0; 
        int square = 1;
        
        for(int i = 0; i<num_list.length; i++){
            sum += num_list[i];
            square *= num_list[i];
        }
        if (square < (sum*sum)){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }
}