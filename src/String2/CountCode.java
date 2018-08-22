package String2;

/*Верните количество раз, когда строка «код» появляется где угодно в данной строке, за исключением того,
что мы примем любую букву для «d», так что «cope» и «cooe» count.
        countCode («aaacodebbb») → 1
        countCode («codexxcode») → 2
        countCode («cozexxcope») → 2*/

public class CountCode {
    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                 count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountCode code = new CountCode();
        String str = "cozexxcope";
        code.countCode(str);
        System.out.println(code.countCode(str));
    }
}
