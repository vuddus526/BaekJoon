import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // 첫째줄 부터 아홉째줄 까지 자연수를 받는다
        // 이를 배열에 담아서 담은걸 for문 돌린다
        // 인덱스와 max를 비교해 인덱스가 max보다 크면 max에 대입
        // 대입 될 때마다 count++

        int arr[] = { sc.nextInt(), sc.nextInt(), sc.nextInt(),
                    sc.nextInt(), sc.nextInt(), sc.nextInt(),
                    sc.nextInt(), sc.nextInt(), sc.nextInt() };

        int max = 0;
        int count = 0;
        int index = 0;

        for(int i=0; i<arr.length; i++) {
            count++;

            if(arr[i] > max) {
                max = arr[i];
                index = count;
            }
        }
        System.out.println(max + "\n" + index);
    }
}