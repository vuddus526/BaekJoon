import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 어떠한 문자가 주어지면 각 알파벳이 몇번째 순서에 나오는지 체크한다
		// 알파벳 개수 26개의 배열을 만든다
		// 일단 배열에 -1로 다 채운다
		// for문 돌면서 chatAt()으로 각 순서의 문자를 뽑아서 ch 변수에 저장한다
		// ch를 아스키코드 a == 97 이므로 이걸 빼준다
		// 그럼 예를들어 b - a 해서 1이 된다 이 1을 배열 에 저장한다

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[26];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}

		String s = sc.nextLine();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}

		for (int val : arr) {
			System.out.print(val + " ");
		}
	}
}