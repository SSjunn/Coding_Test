import java.util.HashMap;

class Solution {
    public int solution(int[] topping) {

        HashMap<Integer, Integer> older = new HashMap<>();
        HashMap<Integer, Integer> young = new HashMap<>();

        // 1) 초기에 rightMap에 전체 토핑을 카운트한다.
        for (int t : topping) {
            older.put(t, older.getOrDefault(t, 0) + 1);
        }

        int answer = 0;

        // 2) i 지점에서 하나씩 옮기면서 비교
        for (int i = 0; i < topping.length; i++) {

            int t = topping[i];

            // 철수에게 넘어감 → leftMap에 추가
            young.put(t, young.getOrDefault(t, 0) + 1);

            // 동생쪽 rightMap에서 하나 감소
            older.put(t, older.get(t) - 1);
            if (older.get(t) == 0) {
                older.remove(t); // 종류가 0개면 토핑 종류 제거
            }

            // 종류가 같으면 공평한 분할
            if (young.size() == older.size()) {
                answer++;
            }
        }

        return answer;
    }
}
