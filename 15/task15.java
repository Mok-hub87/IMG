import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку ");
        String a=scanner.nextLine();
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char c : a.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
                sb.append(c);
            }
        }
        String FinalLine = sb.toString();
        System.out.println(FinalLine);
    }
}