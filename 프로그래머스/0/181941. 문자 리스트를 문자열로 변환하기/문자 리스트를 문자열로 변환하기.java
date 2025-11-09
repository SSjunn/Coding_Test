/*  
    배열 arr[0] 을 하나씩 +1 해서 result에 넣기 
    반복 시작 횟수를 i로 지정
    arr[i] i++ => result 에 담기
    answer
*/
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