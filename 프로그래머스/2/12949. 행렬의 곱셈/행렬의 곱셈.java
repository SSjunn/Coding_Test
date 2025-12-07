class Solution {
        public int[][] solution(int[][] arr1, int[][] arr2) {
            int arr1Row = arr1.length; // arr1 행
            int arr1Col = arr1[0].length; // arr1 열 근데 이게 arr2 행
            int arr2Col = arr2[0].length; // arr2 열

            int[][] answerArr = new int[arr1Row][arr2Col];
            for(int i = 0; i < arr1Row; i++){
                for(int j = 0; j < arr2Col; j++){
                    for(int k = 0; k<arr1Col; k++){
                        answerArr[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }

            return answerArr;
        }
    }