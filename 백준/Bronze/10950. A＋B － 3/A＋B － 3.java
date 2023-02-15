import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스 숫자 받는다
        int n, a, b;
        n = sc.nextInt();
        int arr[] = new int[n];

        // 테스트 케이스 숫자만큼 A B 받는다
        for(int i=0; i<n; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            arr[i] = a+b;
        }
        
        // 배열값 찍기
        for(int j : arr) {
            System.out.println(j);
        }
    }
}