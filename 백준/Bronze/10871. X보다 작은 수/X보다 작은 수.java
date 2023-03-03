import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // 첫째줄 N(총 갯수)과 X(제시 수)가 주어진다
        // 둘째줄 수열 채우기

        int n, x;

        n = sc.nextInt();
        x = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++) {
            if(arr[i] < x) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}