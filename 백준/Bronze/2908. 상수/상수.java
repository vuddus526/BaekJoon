import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 첫줄에 3자리 수 2개를 받는다
		// 받은 수를 반대로 뒤집고 비교해서 큰값을 출력한다

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		sc.close();

		a = Integer.parseInt(new StringBuilder().append(a).reverse().toString());
		b = Integer.parseInt(new StringBuilder().append(b).reverse().toString());

		System.out.println(a > b ? a : b);
	}
}