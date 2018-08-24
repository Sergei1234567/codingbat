package string3;

public class SameEnds {
    public String sameEnds(String string) {
        String result = "";
        int len = string.length();
        for (int i = 0; i <= len / 2; i++) {
            for (int j = len / 2; j < len; j++)
                if (string.substring(0, i).equals(string.substring(j))) {
                    result = string.substring(0, i);
                }
        }
        return result;
    }

    public static void main(String[] args) {
        SameEnds ends = new SameEnds();
        String string = "abXYab";
        System.out.println(ends.sameEnds(string));
    }
}
