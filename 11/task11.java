import java.util.Scanner;
public class task11 {
    public static void main(String[] args) {
        String[] n={"a","e","i","o","u","y"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку ");
        String a = scanner.next();
        for (int j=0;j<n.length;j++){
            a=a.replace(n[j],"");
        }
        System.out.println(a);
    }
}
