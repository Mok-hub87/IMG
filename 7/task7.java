import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        int a = scanner.nextInt();
        int b=0;
        int c=0;
        for (int i = 2; i <= a; i++) {
            b=i*i;
            if (b>a){
                c=i-1;
                break;
            }
        }
        System.out.println(c);
    }
}