import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Введите элементы массива(1 или 0)");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        int num=0;
        for (int i=0;i<length;i++){
            if (array[i]>0){
                num++;
            }
        }
        System.out.println("Сотрудники "+num);
    }
}