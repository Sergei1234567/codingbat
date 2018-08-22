package String2;

/*С учетом строки рассмотрим строку префикса, состоящую из первых N символов строки.
        Эта строка префикса появляется где-то еще в строке?
        Предположим, что строка не пуста и что N находится в диапазоне 1..str.length ().
        prefixAgain ("abXYabc", 1) → true
        prefixAgain ("abXYabc", 2) → true
        prefixAgain ("abXYabc", 3) → false*/

public class PrefixAgain {
    public static boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        for (int i = n; i <= str.length() - n; i++) {
            if(str.substring(i, i + n).equals(prefix)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "abXYabc";
        System.out.println(prefixAgain(str, 2));
    }
}
