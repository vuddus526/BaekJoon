import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // 첫째줄 N개
        // 두째줄 N만큼 숫자 입력해서 배열에 저장
        // 세째줄 v가 몇개있는지 확인후 누적해서 출력

        int n, v;
        int total = 0;

        n = sc.nextInt();
        int[] array = new int[n];

        for(int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }
        v = sc.nextInt();
        for(int i=0; i< array.length; i++) {
            if(v == array[i]) {
                total++;
            }
        }
        System.out.println(total);
    }
}