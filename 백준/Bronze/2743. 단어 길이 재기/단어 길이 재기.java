import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 첫째줄은 string 받아서 길이 구하기

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int leng = s.length();

		System.out.print(leng);
	}
}