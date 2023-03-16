import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 서로 다른 나머지를 가지는 값을 구하는것이고
		// 즉 중복을 지우면 되는것이니 set을 이용해 본다

		Scanner sc = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			h.add(sc.nextInt() % 42);
			//입력받은 값의 나머지 값을 add메소드를 통해 HashSet에 저장
		}

		System.out.print(h.size());
	}
}