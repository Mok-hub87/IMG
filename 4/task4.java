public class task4 {
    public static void main(String[] args) {
        String word = "Hello";
        String symb = "l";
        int str_count = word.length() - word.replace( symb, "").length();
        System.out.println(word);
        System.out.println(str_count);
    }
}
