import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스 숫자 받는다
        int n;
        int sum = 0;
        n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}