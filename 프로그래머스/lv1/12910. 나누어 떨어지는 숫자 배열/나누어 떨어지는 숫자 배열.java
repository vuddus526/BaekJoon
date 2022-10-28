import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        // arr가 들어오고 나누기 값도 들어온다
        // arr 크기만큼 for문을 돌며 인덱스별 수를 뽑아내 나누기값으로 나누고
        // 나머지가 0이면 answer에 담는다
        // 그외에는 담지않으며
        // 하나도 안담기면 -1을 담는다
        
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        
        for(int i=0; i<arr.length; i++){
            if (arr[i] % divisor == 0){
                a1.add(arr[i]);
            }
        }
        if (a1.isEmpty()){
            a1.add(-1);
        }
        answer = new int[a1.size()];

        for(int i=0; i<a1.size(); i++) {
            answer[i] = a1.get(i);
        }

        Arrays.sort(answer);
        
        return answer;
    }
}