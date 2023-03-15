import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 30명의 학생 명부가 있다
		// 출석을 부르는데 2명이 빠졌다
		// 빠진 2명을 2줄로 출력하라

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[31];

		for (int i = 1; i < 29; i++) {
			int success = sc.nextInt();
			arr[success] = 1;
		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != 1) {
				System.out.println(i);
			}
		}
	}
}