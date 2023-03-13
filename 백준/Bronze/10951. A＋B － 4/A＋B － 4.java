import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// a+b를 하는데 입력이없으면 멈추기

		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println(a + b);
		}
	}
}