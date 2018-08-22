package String2;

/*Учитывая строку и int n, верните строку, состоящую из n повторений последних n символов строки.
        Вы можете предположить, что n находится между 0 и длиной строки, включительно.
        repeatEnd («Hello», 3) → «llollollo»
        repeatEnd («Hello», 2) → «lolo»
        repeatEnd («Hello», 1) → «o»*/

import java.util.Arrays;

public class RepeatEnd {
    public static  String repeatEnd(String str, int n) {
        int len = str.length();
        String newWord = "";

        for (int i = 0; i < n; i++) {
            newWord += str.substring(len - n, len);
        }
        return newWord;
    }

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(repeatEnd(str, 3));
    }
}
