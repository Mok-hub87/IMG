import java.util.Scanner;
public class task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числа ");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int q=0;
        if (a<b){
            for (int i=a-4;i<=b;i++){
                q=b*b;
                b-=a;
                System.out.println(q);
            }
        }
        if (b<a){
            for (int j=b-4;j<=a;j++){
                q=a*a;
                a-=b;
                System.out.println(q);
            }
        }
    }
}