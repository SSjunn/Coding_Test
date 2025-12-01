/*
    배열의 크기를 몰라 => ArrayList
    오름차순 정렬 => 배열일 때: Arrays.sort() 컬렉션: Collections.sort()
    
*/
import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        //l~r까지 검사
        for (int num = l; num <= r; num++) {
            
            int x = num;
            boolean ok = true;

            // 각 자리수 검사
            while (x > 0) {
                int digit = x % 10;

                // 0 또는 5가 아니면 실패
                if (digit != 0 && digit != 5) {
                    ok = false;
                    break;
                }

                x /= 10;
            }

            // 모든 자리 검사를 통과한 경우만 추가
            if (ok) {
                list.add(num);
            }
        }

        if (list.isEmpty()) {
            return new int[]{-1};
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
