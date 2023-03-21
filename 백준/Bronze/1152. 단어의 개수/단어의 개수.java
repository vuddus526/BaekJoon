import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 문장이 주어지면 이 문장에 단어가 몇개인지 알아내기

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		int cnt = 0;

		//
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				cnt++;
			}
		}

		// 첫 번째와 마지막이 공백이 아닐때
		if (str.charAt(0) != ' ' && str.charAt(str.length() - 1) != ' ') {
			cnt++;
		}
		// 첫 번째와 마지막이 공백인 경우
		if (str.charAt(0) == ' ' && str.charAt(str.length() - 1) == ' ') {
			cnt--;
		}
		System.out.println(cnt);
	}
}