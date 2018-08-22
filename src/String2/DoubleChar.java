package String2;
/*читывая строку, верните строку, где для каждого символа в оригинале есть два символа.
        doubleChar («The») → «TThhee»
        doubleChar («AAbb») → «AAAAbbbb»
        doubleChar («Привет-там») → «HHii - TThheerree»*/

public class DoubleChar {
    public String doubleChar(String str) {
        String string = "";
        for (int i = 0; i < str.length() ; i++) {
        string += str.charAt(i);
        string += str.charAt(i);
        }
        return string;
    }

    public static void main(String[] args) {
        DoubleChar dChar = new DoubleChar();
        String str = "AAbb";
        System.out.println(dChar.doubleChar(str));
    }
}
