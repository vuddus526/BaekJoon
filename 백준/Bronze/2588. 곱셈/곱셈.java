import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String imsi = Integer.toString(B);

        char a = imsi.charAt(0);
        char b = imsi.charAt(1);
        char c = imsi.charAt(2);

        int z = A * (c -'0');
        int x = A * (b -'0');
        int y = A * (a -'0');
        int t = z+(x*10)+(y*100);
        System.out.println(z);
        System.out.println(x);
        System.out.println(y);
        System.out.println(t);
    }
}