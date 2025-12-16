class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int n = queue1.length;
        int size = n * 2;

        long[] arr = new long[size];
        long sum1 = 0;
        long total = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = queue1[i];
            arr[i + n] = queue2[i];
            sum1 += queue1[i];
            total += queue1[i] + queue2[i];
        }

        if (total % 2 != 0) return -1;

        long target = total / 2;

        int left = 0;
        int right = n;
        int count = 0;

        while (left < size && right < size && count <= size * 2) {
            if (sum1 == target) {
                return count;
            } else if (sum1 < target) {
                sum1 += arr[right];
                right++;
            } else {
                sum1 -= arr[left];
                left++;
            }
            count++;
        }

        return -1;
    }
}
