package String2;

/*Возвращает true, если данная строка содержит строку «bob», но где средний символ «o» может быть любым символом.
        bobThere ("abcbob") → true
        bobThere ("b9b") → true
        bobThere ("bac") → false*/

public class BobThere {
    public static  boolean bobThere(String str) {
        for (int i = 0; i < str.length()-2; i++) {
            if(str.charAt(i) == 'b' && str.charAt(i + 2) == 'b'){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "bac";
        System.out.println(bobThere(str));
    }
}
