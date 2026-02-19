import java.util.*;

class Solution {
    private boolean[] used; // 티켓 체크
    private String[] answer; // 최단경로 저장
    private boolean found = false; // 실패면 계속 찾음
    
    public String[] solution(String[][] tickets) {
        Arrays.sort(tickets, (a, b) -> a[1].compareTo(b[1])); // 도착지 알파벳 순 정렬
        
        used = new boolean[tickets.length];
        answer = new String[tickets.length + 1];
        
        answer[0] = "ICN";
        dfs("ICN", tickets, 0);
        
        return answer;
    }
    
    // 내 공항, 전체 티켓 목록, 사용한 티켓수
    private void dfs(String current, String[][] tickets, int depth) {
        if (found) return;
        
        // 모든 티켓 사용 완료
        if (depth == tickets.length) {
            found = true;
            return;
        }
        
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i][0].equals(current) && !used[i]) {
                used[i] = true;
                answer[depth + 1] = tickets[i][1];
                dfs(tickets[i][1], tickets, depth + 1);
                if (found) return; // 정답 찾으면 끝
                used[i] = false;
            }
        }
    }
}