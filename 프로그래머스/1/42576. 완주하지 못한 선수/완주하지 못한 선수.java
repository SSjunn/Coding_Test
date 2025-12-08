import java.util.HashMap;
class Solution {
        public String solution(String[] participant, String[] completion) {

            HashMap<String, Integer> map = new HashMap<>();

            // participant(참자가) map에 넣어줘
            for(int i = 0; i< participant.length; i++){
                String name = participant[i];
                //key 존재하면 해당 값 반환 +1, 없으면 0
                map.put(name, map.getOrDefault(name, 0)+1);
            }
            // completion(완주자) 제거할게
            for (int i = 0;  i< completion.length; i++){
                String name = completion[i];
                // 이름 있어? 제거해버려
                map.put(name, map.get(name)-1);
            }
            // 야 완주 못했냐?ㅋ
            for(String name : map.keySet()){
                if(map.get(name) != 0){
                    return name;
                }
            }

            return "";
        }
    }