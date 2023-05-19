import java.util.Scanner;
public class task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя ");
        String a = scanner.next();
        String q =a.substring(0, 1).toUpperCase();
        String w =a.substring(1).toLowerCase();
        System.out.println("Привет, "+q+w);
    }
}