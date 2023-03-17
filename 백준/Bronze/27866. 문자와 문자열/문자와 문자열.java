import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 첫째줄은 영문자
		// 두째줄은 인덱스값
		// 인덱스에 해당하는 글자를 출력해라

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int i = sc.nextInt();

		char c = s.charAt(i - 1);

		System.out.print(c);
	}
}