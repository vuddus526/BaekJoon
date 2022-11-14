class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int temp = 0;
        String str = String.valueOf(x);
        for(int i=0; i<str.length(); i++){
            temp += str.charAt(i)-'0';
        }

        if(!(x % temp == 0)){
            answer = false;
        }
        
        return answer;
    }
}