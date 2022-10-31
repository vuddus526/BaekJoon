class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String low = s.toLowerCase();
        int count1 = 0;
        int count2 = 0;

        for(int i=0; i<low.length(); i++){
            if (low.charAt(i) == 'p'){
                count1++;
            }else if(low.charAt(i) == 'y'){
                count2++;
            }
        }
        if (count1 != count2){
            answer = false;
        }

        return answer;
    }
}