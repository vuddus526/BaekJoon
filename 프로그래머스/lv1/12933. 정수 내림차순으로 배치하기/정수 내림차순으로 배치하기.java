import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String temp = "";
        String str = String.valueOf(n);

        ArrayList<Character> list = new ArrayList<>();

        for(int i=0; i<str.length(); i++){
            list.add(str.charAt(i));
        }

        list.sort(Comparator.reverseOrder());

        for(int i=0; i<str.length(); i++){
            temp += list.get(i);
        }

        answer = Long.parseLong(temp);
        
        return answer;
    }
}