package String1;

//Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
//
//        firstHalf("WooHoo") → "Woo"
//        firstHalf("HelloThere") → "Hello"
//        firstHalf("abcdef") → "abc"

public class FirstHalf {
    private static String firstHalf(String str) {
        str = "WOODOO";
        return str.substring(0, str.length() / 2);
    }

    public static void main(String[] args) {
        System.out.println(firstHalf("WOODOO"));
    }
}
