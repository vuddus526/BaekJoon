import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 첫번째줄에 별이 몇줄 찍힐지 받기
		// 첫째줄 1개 두째줄 2개 ... n번째줄 n개
		// 그러나 왼쪽에서가 아닌 오른쪽에서부터 찍히기

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}