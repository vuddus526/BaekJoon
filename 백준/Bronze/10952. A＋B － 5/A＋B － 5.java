import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// a+b를 하는데 마지막 입력 0 0 일때는 출력안한다

		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			if ((a + b) == 0) {
				break;
			}
			System.out.println(a + b);
		}
	}
}