import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Введите элементы массива");
        int sum =0;
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
            sum += array[i]*array[i];
            System.out.print(sum);
        }
    }
}
