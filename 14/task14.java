import java.util.Scanner;
public class task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[3];
        int n = 0;
        for (n=0;n < a.length;) {
            System.out.println("Введите число ");
            int w = scanner.nextInt();
            if (n == 0 || w > a[n - 1]) {
                a[n] = w;
                n++;
            } else {
                for (int i = 0; i < n; i++) {
                    if (w < a[i]) {
                        for (int j = n - 1; j >= i; j--) {
                            a[j + 1] = a[j];
                        }
                        a[i] = w;
                        break;
                    }
                }
            }
            System.out.println(a[0] + " " + a[1] + " " + a[2]);
        }
    }
}
