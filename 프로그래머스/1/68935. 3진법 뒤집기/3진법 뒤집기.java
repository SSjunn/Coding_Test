class Solution {
        public int solution(int n) {
            String share = ""; // 나머지 저장

            while (n > 0) {
                share += (n % 3);
                n /= 3;
            }
            System.out.println(share); // 출력값 0021

            // 10진법 어떻게 바꾸는거지?
            // 일단 쪼개 보고
            String[] arr = share.split("");
            int sum = 0;
            int exponentiation  = 1; // 이거 거듭제곱이다!!

            for(int i = arr.length -1; i>=0; i--){
                int num = Integer.parseInt(arr[i]);
                sum += num * exponentiation;
                exponentiation *= 3;
            }

            return sum;
        }
    }