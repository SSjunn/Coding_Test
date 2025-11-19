class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            // 앞에 하나씩 뽑아
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            //s부터 e까지 반복 하고 배수 이면 arr[idx]+=1
            for (int idx = s; idx <= e; idx++) {
                if (idx % k == 0) {
                    arr[idx] += 1;
                }
            }
        }
        return arr;
    }
}
