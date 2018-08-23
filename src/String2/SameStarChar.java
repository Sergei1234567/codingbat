package String2;

/*Возвращает true, если для каждой «*» (звезды) в строке, если есть символы сразу
  до и после звезды, они одинаковы.
        sameStarChar("xy*yzz") → true
        sameStarChar("xy*zzz") → false
        sameStarChar("*xa*az") → true*/

public class SameStarChar {
    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length()-1; i++) {
            if(str.charAt(i) == '*' && str.charAt(i-1) != str.charAt(i+1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        SameStarChar sam = new SameStarChar();
        String str = "xy*yzz";
        System.out.println(sam.sameStarChar(str));
    }
}
