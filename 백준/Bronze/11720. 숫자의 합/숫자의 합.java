import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 숫자의 개수
        int N = scanner.nextInt();
        // 두 번째 공백없이 주어진 N개의 숫자
        String sNum  = scanner.next();
        // 각 숫자를 뽑아서 char 배열에 넣기
        char[] cNum = sNum.toCharArray();
        // for문으로 배열에 있는 값을 아스키코드 이용해서 정수 만들기
        int sum = 0;
        for(int i=0; i<cNum.length; i++) {
            sum += cNum[i] - '0';
        }
        System.out.println(sum);
    }
}