package String2;

/*Учитывая две строки, верните true,
 если одна из строк появляется в самом конце другой строки,
 игнорируя разницу в верхнем / нижнем регистре
 (другими словами, вычисление не должно быть «чувствительным к регистру»).
 Примечание: str.toLowerCase () возвращает строчную версию строки.
        endOther («Hiabc», «abc») → true
        endOther («AbC», «HiaBc») → true
        endOther («abc», «abXabc») → true*/

public class EndOther {
    public static boolean endOther(String a, String b) {
        if (a.length() < b.length()) {
            String temp = a;
            a = b.toLowerCase();
            b = temp.toLowerCase();
        }
        return a.substring(a.length() - b.length()).equals(b);
    }

    public static void main(String[] args) {
        String a = "Hiabc";
        String b = "abv";
        System.out.println(endOther(a, b));
    }
}
