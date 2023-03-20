import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 첫째줄에 테스트케이스 수가 주어진다
		// 두번째 줄부터 첫번째에 몇번 반복할건지 두번째에 문자열이 주어진다
		// 이때 3 ABC 라면 AAABBBCCC 이런식으로 각 문자를 반복해서 P라는 문자열을 만들면된다

		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();

		for (int i = 0; i < testCase; i++) {

			int n = sc.nextInt();
			String s = sc.next();

			for (int j = 0; j < s.length(); j++) {
				for (int k = 0; k < n; k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}
}