class Solution {

    int[] numbers;
    int target;
    int answer;

    // DFS 탐색
    void dfs(int index, int sum) {
        // 모든 숫자를 다 사용한 경우
        if (index == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }

        // 현재 숫자를 더하는 경우
        dfs(index + 1, sum + numbers[index]);

        // 현재 숫자를 빼는 경우
        dfs(index + 1, sum - numbers[index]);
    }

    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        this.answer = 0;

        // DFS 시작
        dfs(0, 0);

        return answer;
    }
}
