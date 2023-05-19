import java.util.Scanner;
public class task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку ");
        String a = scanner.nextLine();
        int u=0;
        int l=0;
        for (int k = 0; k < a.length(); k++) {
            if (Character.isUpperCase(a.charAt(k))){
                u++;
            }
            if (Character.isLowerCase(a.charAt(k))){
                l++;
            }
        }
        if (u>l){
            String b=a.toUpperCase();
            System.out.println(b);
        }
        if (l>u){
            String b=a.toLowerCase();
            System.out.println(b);
        }
        if (u==l){
            String b=a.toLowerCase();
            System.out.println(b);
        }
    }
}
