class Solution {
    public int solution(int num) {
        int answer = 0;
        
        if(num == 1){
            // num이 1이면 0
            answer = 0;
        }

        for(int i=0; i<500; i++) {
            if(num == 1){
                // for문 돌다 num이 1이 되면 반복수 i
                answer = i;
                break;
            }else if(num % 2 == 0){
                // num이 짝수면 나누기 2
                num = num / 2;
            }else if(num % 2 == 1){
                // num이 홀수면 곱하기 3 더하기 1
                num = num * 3 + 1;
            }else{
                // num이 500번 돌때까지 1이 안된다면 -1
                answer = -1;
            }
        }
        
        return answer;
    }
}