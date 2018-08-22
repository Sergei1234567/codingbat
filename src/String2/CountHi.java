package String2;

/*Верните количество раз, когда строка «hi» появляется где угодно в данной строке.
        countHi ("abc hi ho") → 1
        countHi ("ABChi hi") → 2
        countHi ("hihi") → 2*/

public class CountHi {
    private static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "abchiho";
        System.out.println(countHi(str));
    }
}
