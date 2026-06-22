/*
class Solution {
    public String solution(String str1, String str2) {
        String result ="";
        
        for(int i = 0; i<str1.length(); i++){
        result += str1.charAt(i);
        result += str2.charAt(i);
        }
        return result;
    }
    
}
*/

// String result = "" 방식은 새로운 String 객체를 계속해서 생성을 하기 때문에 O(n²) 시간 복잡도가 나오게 된다. 따라서 StingBuilder 를 사용하여 시간을 O(n) 시간으로 줄여서 사용을 해준다.

class Solution {
    public String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        int i = 0; int j = 0;
        
        while (i < str1.length() || j < str2.length()) {
            if (i < str1.length()) {
                sb.append(str1.charAt(i));
                i++;
            }
            if (j < str2.length()) {
                sb.append(str2.charAt(j));
                j++;
            }
        }
        return sb.toString();
    }
}