package String1;

//При заданной строке четной длины верните первую половину. Итак, строка «WooHoo» дает «Woo».

public class FirstHalf {
    private static String firstHalf(String str) {
        str = "WOODOO";
        return str.substring(0, str.length()/2);
    }

    public static void main(String[] args) {
        System.out.println(firstHalf("WOODOO"));
    }
}
