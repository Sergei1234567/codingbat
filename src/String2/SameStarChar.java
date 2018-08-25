package String2;

//Returns true if for every '*' (star) in the string, if there are chars both
//        immediately before and after the star, they are the same.
//
//        sameStarChar("xy*yzz") → true
//        sameStarChar("xy*zzz") → false
//        sameStarChar("*xa*az") → true

public class SameStarChar {
    public boolean sameStarChar(String str) {
        int i = 1;
        while (i < str.length() - 1) {
            if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1))
                return false;
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        SameStarChar sam = new SameStarChar();
        String str = "xy*yzz";
        System.out.println(sam.sameStarChar(str));
    }
}
