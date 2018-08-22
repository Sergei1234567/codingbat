package String1;

/*С учетом строки верните «поворот вправо 2», где последние 2 символа будут перенесены в начало.
        Длина строки будет не менее 2.
        right2("Hello") → "loHel"
        right2("java") → "vaja"
        right2("Hi") → "Hi"*/

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
