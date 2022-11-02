class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        // 서울 배열을 도는 for문으로 인덱스 0 1 에 equals 써서 kim 이면
        // answer에 김서방은 인덱스에 있다고 출력
        
        for(int i = 0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer ="김서방은 " + i + "에 있다";
            }
        }
        
        return answer;
    }
}