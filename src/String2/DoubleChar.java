package String2;

//Given a string, return a string where for every char in the original, there are two chars.
//
//        doubleChar("The") → "TThhee"
//        doubleChar("AAbb") → "AAAAbbbb"
//        doubleChar("Hi-There") → "HHii--TThheerree"

public class DoubleChar {
    public String doubleChar(String str) {
        String string = "";
        int i = 0;
        while (i < str.length()) {
            string += str.charAt(i);
            string += str.charAt(i);
            i++;
        }
        return string;
    }

    public static void main(String[] args) {
        DoubleChar dChar = new DoubleChar();
        String str = "AAbb";
        System.out.println(dChar.doubleChar(str));
    }
}
