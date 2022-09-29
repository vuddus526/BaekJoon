import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        // 들어온 값의 n번째 문자를 뽑아서 기존의 들어온 값 맨 앞에 붙이기
        // 그 상태에서 정렬해주고
        // 다시 반복문 돌며 붙인거 이후 인덱스인 1 부터 문자열 끝 인덱스 잘라 붙이기
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        
        return answer;
    }
}