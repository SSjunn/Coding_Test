import java.util.HashMap;
class Solution {
    public String[] solution(String[] record) {
          HashMap<String, String> map = new HashMap<>();

        // 돌려
        for (String r : record) {
            String[] temp = r.split(" ");
            String cmd = temp[0];

            if ("Enter".equals(cmd) || "Change".equals(cmd)) {
                map.put(temp[1], temp[2]);
            }
        }

        // 출력 메시지 개수 계산
        int count = 0;
        for (String r : record) {
            String cmd = r.split(" ")[0];
            if (!"Change".equals(cmd)) {
                count++;
            }
        }

        // 메시지 생성
        String[] answer = new String[count];
        int idx = 0;

        for (String r : record) {
            String[] temp = r.split(" ");
            String cmd = temp[0];
            String uid = temp[1];

            if ("Enter".equals(cmd)) {
                answer[idx++] = map.get(uid) + "님이 들어왔습니다.";
            }
            else if ("Leave".equals(cmd)) {
                answer[idx++] = map.get(uid) + "님이 나갔습니다.";
            }
        }

        return answer;
    }
}