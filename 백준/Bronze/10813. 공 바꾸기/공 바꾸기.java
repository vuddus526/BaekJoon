import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 첫째줄에 n(바구니 수), m(바꿀횟수)
		// 처음에는 각 바구니에 순서 번호가 들어있다
		// 바꿀 횟수에따라 공을 바꿔준다

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			int temp = arr[a - 1];
			arr[a - 1] = arr[b - 1];
			arr[b - 1] = temp;

		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}