package warmup1;

/*Учитывая строку, мы скажем, что фронт - это первые 3 символа строки.
        Если длина строки меньше 3, фронт - это все, что есть.
        Верните новую строку, которая составляет 3 копии фронта.
        front3("Java") → "JavJavJav"
        front3("Chocolate") → "ChoChoCho"
        front3("abc") → "abcabcabc*/

public class Front3 {
    public String front3(String str) {
        if (str.length() <= 3) {
            return str + str + str;
        }
        String temp = str.substring(0, 3);
        return temp + temp + temp;
    }

    public static void main(String[] args) {
        Front3 fr = new Front3();
        String str = "Java";
        System.out.println(fr.front3(str));
    }
}
