import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 첫번째 줄에 n , m 을 받는다
		// 두번재에 i j k 를 받는다
		// i 부터 j 까지 k 를 넣는다는 뜻이다

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int m = sc.nextInt();
		for (int a = 0; a < m; a++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();

			for (int b = i - 1; b < j; b++) {
				arr[b] = k;
			}
		}

		for (int b = 0; b < arr.length; b++) {
			System.out.print(arr[b] + " ");
		}

	}
}