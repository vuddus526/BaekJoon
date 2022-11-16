import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int king = 1 - scanner.nextInt();
        int Quin = 1 - scanner.nextInt();
        int look = 2 - scanner.nextInt();
        int bishop = 2 - scanner.nextInt();
        int night = 2 - scanner.nextInt();
        int phone = 8 - scanner.nextInt();

        System.out.print(king + " ");
        System.out.print(Quin + " ");
        System.out.print(look + " ");
        System.out.print(bishop + " ");
        System.out.print(night + " ");
        System.out.print(phone);
    }
}