/*  
    배열 arr[0] 을 하나씩 +1 해서 result에 넣기 
    반복 시작 횟수를 i로 지정
    arr[i] i++ => result 에 담기
    answer
*/
/*
class Solution {
    public String solution(String[] arr) {
        String result = "";
        int i;
        for(i =0; i<arr.length; i++){
            result +=arr[i];
        }
        System.out.println(result);
        return result; // ← 이게 있어야 약속 지켜짐!
    }
}
*/

// 배열 arr 배열을 하나씩 붙여서 문자열 생성
class Solution{
    public String solution(String[] arr){
        StringBuilder sb = new StringBuilder();
        // int i = 0;
        
        // while(i < arr.length){
        //     sb.append(arr[i]);
        //     i++;
        // }
        
        for (int i = 0; i<arr.length; i++){
            sb.append(arr[i]);
        }
        
        return sb.toString();
    }
}