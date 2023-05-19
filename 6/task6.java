import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        int a = scanner.nextInt();
        for (int i = 2; i <= a; i++) {
            boolean b = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                System.out.println(i);
            } else {
                System.out.println("не простое число");
            }
        }
    }
}
