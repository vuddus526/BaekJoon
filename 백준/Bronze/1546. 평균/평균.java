import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 평균 구하기
		Scanner scanner = new Scanner(System.in);

		// 첫번째 줄 시험을 본 과목의 개수
		int N = scanner.nextInt();
		// 두번째 줄 각 과목의 점수 넣을 int[]
		int score[] = new int[N];
		// for문으로 score에 각 과목의 점수를 넣는다
		for(int i=0; i<N; i++) {
			score[i] = scanner.nextInt();
		}
		// 배열에서 max값과 sum을 구한다
		long max = 0;
		long sum = 0;
		for (int i=0; i<score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}
			sum += score[i];
		}
		
		System.out.println(sum * 100.0 / max / N);	//75
	}
}