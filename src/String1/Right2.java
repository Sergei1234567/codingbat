package String1;

//Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
//        The string length will be at least 2.
//
//        right2("Hello") → "loHel"
//        right2("java") → "vaja"
//        right2("Hi") → "Hi"

public class Right2 {
    public String right2(String str) {
        String s = str.substring(str.length() - 2);
        String f = str.substring(0, str.length() - 2);
        return s + f;
    }

    public static void main(String[] args) {
        Right2 ri = new Right2();
        String str = "Hello";
        System.out.println(ri.right2(str));
    }
}
