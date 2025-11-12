/*
for (num_list까지 반복){
    if(홀수){
        홀수
    }else{
        짝수 
    }
}
answer += num_list[i];
System.out.println(Arrays.toString(values));
*/
class Solution {
    public int solution(int[] num_list) {
        String hol ="";
        String chak ="";
        for(int i =0; i<num_list.length; i++){
            if(num_list[i]%2 == 0){
               chak += num_list[i];
            }else{
               hol += num_list[i];
            }
        }
        int holint = Integer.parseInt(hol);
        int chakint = Integer.parseInt(chak);
        return holint + chakint;
    }
}