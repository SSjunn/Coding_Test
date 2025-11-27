/*
    Arrays.copyOfRange() 이 함수가 존재한다고 한다!! => 이게 문자열의 substring 같은 존재.

*/
//  class Solution {
//     public int[] solution(int[] num_list, int n) {
//         int[] answer = new int[num_list.length - (n - 1)];

//         for (int i = n - 1, j = 0; i < num_list.length; i++, j++) {
//             answer[j] = num_list[i];
//         }

//         return answer;
//     }
// }
import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = Arrays.copyOfRange(num_list, n - 1, num_list.length);
        return answer;
    }
}
