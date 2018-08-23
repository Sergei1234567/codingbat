package string3;

/*С учетом строки подсчитайте количество слов, заканчивающихся на «y» или «z»,
        поэтому «y» в «тяжелом» и «z» в «fez», но не «y» в «желтом», (нечувствительный к регистру).
        Мы скажем, что ay или z находится в конце слова, если буква не сразу после него.
        (Примечание: Character.isLetter (char) проверяет, является ли символ буквой.)
        countYZ("fez day") → 2
        countYZ("day fez") → 2
        countYZ("day fyyyz") → 2*/

public class CountYZ {
    public int countYZ(String str) {
        if (str.length() == 0){
            return 0;
        }

        int count = 0;

        for (int i = 0; i <= str.length() - 2; i++) {
            if ((Character.toLowerCase(str.charAt(i)) == 'y' ||
                    Character.toLowerCase(str.charAt(i)) == 'z') &&
                    !Character.isLetter(str.charAt(i + 1)))
                count++;
        }

        if (Character.toLowerCase(str.charAt(str.length() - 1)) == 'y' ||
                Character.toLowerCase(str.charAt(str.length() - 1)) == 'z')
            count++;

        return count;
    }

    public static void main(String[] args) {
        CountYZ yz = new CountYZ();
        String str = "fez day";
        System.out.println(yz.countYZ(str));
    }
}
