/*
split 써서 쪼개려면 long -> String 바꿔주기
바꿔준거 배열에 담아
그리고 뒤부터 출력해
*/
class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n); // long -> string
        String[] arr = str.split(""); // 쪼개
        int[] answer = new int[arr.length]; // int 배열 담을거 만들어
        
        for(int i = 0; i<arr.length; i++){
            answer[i] = Integer.parseInt(arr[i]); // 1,2,3,4,5 담아
        }
        
        int[] reverse = new int[answer.length];
        // 배열 뒤집기
        for (int i = answer.length - 1; i >= 0; i--) {
            reverse[answer.length - 1 - i] = answer[i];
        }
        return reverse;

        
    }
}
