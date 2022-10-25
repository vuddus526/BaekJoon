class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = 0;
        
        for (int i=0; i<answer.length; i++){
            num += x;
            answer[i] += (long)num;
        }
        
        return answer;
    }
}