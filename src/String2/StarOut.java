package String2;

/*Верните версию данной строки, где для каждой звезды (*)
в строке звездочка и символы сразу слева и справа исчезли.
 Таким образом, «ab * cd» дает «объявление» и «ab ** cd» также дает «объявление».
        starOut («ab * cd») → «ad»
        starOut («ab ** cd») → «ad»
        starOut («sm * eilly») → «глупый»*/

public class StarOut {
    public String starOut(String str) {
        int len = str.length();
        String finalString = "";

        for (int i = 0; i < len; i++) {
            if (i == 0 && str.charAt(i) != '*')
                finalString += str.charAt(i);

            if (i > 0 && str.charAt(i) != '*' && str.charAt(i - 1) != '*')
                finalString += str.charAt(i);

            if (i > 0 && str.charAt(i) == '*' && str.charAt(i - 1) != '*')
                finalString = finalString.substring(0, finalString.length() - 1);
        }
        return finalString;
    }


    public static void main(String[] args) {
        StarOut star = new StarOut();
        String str = "sm*eilly";
        System.out.println(star.starOut(str));
    }
}
