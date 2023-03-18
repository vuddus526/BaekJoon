import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 첫째줄은 테스트 케이스 수
		// 두번째 줄부터 케이스 수 만큼 string 값들이 나온다
		// 각 string 의 처음과 끝을 구해서 출력한다

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String s = sc.next();
			System.out.println(s.charAt(0) + "" + s.charAt(s.length() - 1));
		}
	}
}