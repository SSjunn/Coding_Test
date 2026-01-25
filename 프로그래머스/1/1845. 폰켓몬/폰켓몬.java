import java.util.HashSet;    
class Solution {
        public int solution(int[] nums) {
            // 선택 가능 포켓몬 수
            int max = nums.length / 2;

            // 중복제거하기
            HashSet<Integer> pokemon = new HashSet<>();

            for (int num : nums) {
                pokemon.add(num);
            }

            // 중복을 제거한 셋의 크기가 max보다 크면 max를, 작으면 pokemon의 size를 리턴
            if (pokemon.size() > max) {
                return max;
            } else {
                return pokemon.size();
            }
        }
    }