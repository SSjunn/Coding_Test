/*
    x % 2 == 0; 짝수일때 x / 2
    x % 2 == 1; 홀수일때 3*x+1
    해서 언젠가는 x가 1이 되는지 => 1 이 되면 반환 하면 됌

*/

import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }

            list.add(n);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}