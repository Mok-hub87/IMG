import java.util.Scanner;
public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длины 3-х сторон ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c=scanner.nextInt();
        if (a + b > c && a + c > b && b + c > a){
            double cosA = (b * b + c * c - a * a) / (2.0 * b * c);
            double cosB = (a * a + c * c - b * b) / (2.0 * a * c);
            double cosC = (a * a + b * b - c * c) / (2.0 * a * b);
            double maxCos = Math.max(cosA, Math.max(cosB, cosC));
            double maxAngle = Math.toDegrees(Math.acos(maxCos));
            System.out.println("Макс внешний угол= " + maxAngle);
        } else {
            System.out.println("Треугольник нельзя составить");
        }
    }
}