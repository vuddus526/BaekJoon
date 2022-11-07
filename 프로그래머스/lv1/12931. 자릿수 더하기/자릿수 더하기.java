import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String stringN = Integer.toString(n);

        for(int i=0; i<stringN.length(); i++){
            answer += stringN.charAt(i)-'0';
        }

        return answer;
    }
}