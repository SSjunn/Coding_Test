class Solution {
    public int[] solution(int brown, int yellow) {

        int total = brown + yellow;

        for (int height = 3; height <= total; height++) {
            for (int width = height; width <= total; width++) {

                // 전체 넓이 검사
                if (width * height != total) continue;

                // 노란색 영역 검사
                if ((width - 2) * (height - 2) == yellow) {
                    return new int[]{width, height};
                }
            }
        }

        return new int[0];
    }
}
