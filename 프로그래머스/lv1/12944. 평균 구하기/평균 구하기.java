class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double avg = 0;
        for(int i=0; i<arr.length; i++) {
            answer += arr[i];
            avg = answer/arr.length;
        }
        return avg;
    }
}