class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        
        int sum = 0;
        int total = 0;
        int max = 45;

        for (int i=0; i<numbers.length; i++) {
            sum += numbers[i];
            total = max-sum;
        }
        
        return answer = total;
    }
}