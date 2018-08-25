package String2;
//Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
//        You may assume that n is between 0 and the length of the string, inclusive.
//
//        repeatEnd("Hello", 3) → "llollollo"
//        repeatEnd("Hello", 2) → "lolo"
//        repeatEnd("Hello", 1) → "o"

public class RepeatEnd {
    public static String repeatEnd(String str, int n) {
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
