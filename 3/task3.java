import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a[][] = new float[3][3];
        for(int i = 0; i < 3; i++){
            System.out.println("Введите координаты вершины");
            for(int j = 0; j < 2; j++){
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println(a[0][0] + a[1][0] + a[2][0] / 3 + "," + a[0][1] + a[1][1] + a[2][1] / 3);
    }
}
