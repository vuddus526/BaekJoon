import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫번째줄 총금액
        // 두번째줄 구매 개수
        // 세번째줄부터 첫번째에 가격 두번째에 개수

        // 테스트 케이스 숫자 받는다
        int total;
        int sum = 0;
        int n;
        int a;
        int b;

        total = sc.nextInt();
        n = sc.nextInt();

        for(int i=0; i<n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            sum += a*b;
        }

        if (sum == total) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}