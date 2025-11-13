/*
    그냥 마지막 인덱스 구하고 마지막에서 -1 인덱스 구한다음
    if (비교 연산 때리고){
    
    }else{
    
    }
    이렇게 풀면 끝
    int[] answer = new int[1]; // 크기 1짜리 배열 만들기

    if (num_list[lastIndex] > num_list[SFTBIndex]) {
        answer[0] = num_list[lastIndex] - num_list[SFTBIndex];
    } else {
        answer[0] = num_list[lastIndex] * 2;
    }
*/
class Solution {
    public int[] solution(int[] num_list) {
        // int[] answer = {};
        int [] answer = new int[num_list.length +1]; // 이거 사이즈를 하나 키워놔야 뒤에 하나를 더 넣지
        for (int i =0; i< num_list.length; i++){
            answer[i] = num_list[i];
        }
        // int[] answer = new int[1];
        // int lastIndex = num_list.size() - 1; // 배열은 size() 안된다.
        int lastIndex = num_list[num_list.length - 1]; // 마지막 원소
        int SFTBIndex = num_list[num_list.length - 2]; // 마지막에서 2번째
        if(lastIndex > SFTBIndex){
            answer[num_list.length] = lastIndex - SFTBIndex;
        }else{
            answer[num_list.length] = lastIndex * 2;
        }
        

        // return answer;
        return answer;
    }
}