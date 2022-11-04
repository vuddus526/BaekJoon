import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
    
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        //반복되는 거 처리용
        //참가자 중에는 동명이인이 있을 수 있습니다.
        //completion의 길이는 participant의 길이보다 1 작습니다.
        // 위 2개 조건으로 인해, 동명이인은 최대 1명밖에 발생안하니 예외사항 고려안해도됨 (동명이인이 2명이면? 같은 것들)
        for(int i=0; i<completion.length; i++){
            if(!participant[i].equals(completion[i])){
                answer = participant[i];
                break;
            }

        // 맨 마지막 자리 추출용
        if(i == completion.length-1){
            answer = participant[i+1];
        }

        }
        return answer;
    }
}