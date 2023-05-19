import java.util.Scanner;
public class task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите две строки");
        String a = scanner.next();
        String b = scanner.next();
        boolean End = a.endsWith(b);
        System.out.println(End);
    }
}