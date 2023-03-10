import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 첫번째 줄 케이스 수 받고
		// 두번째 줄 부터 케이스 수 만큼 값 입력
		// Case #1: 1 + 1 = 2 이런식으로 출력

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a + b));
		}
	}
}