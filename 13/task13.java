import java.util.Scanner;
public class task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числа ");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int q=0;
        int w=0;
        for (int i=a;i<=a*b*c;i++){
            q=a;
            a+=b;
            w+=1;
            if (w>c){
                break;
            }
            System.out.println(q);
        }
    }
}
