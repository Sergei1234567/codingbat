package Ap1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*Учитывая массив строк, верните новый List (например, ArrayList), где все строки данной длины опущены.
 См. Ниже слова ниже (), что сложнее, потому что оно использует массивы.
        wordsWithoutList (["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
        wordsWithoutList (["a", "bb", "b", "ccc" ], 3) → ["a", "bb", "b"]
        wordsWithoutList (["a", "bb", "b", "ccc"], 4) → ["a", "bb" "b", "ccc"]*/

public class WordsWithoutLis {
    public List wordsWithoutList(String[] words, int len) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() != len){
                list.add(words[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        WordsWithoutLis lis = new WordsWithoutLis();
        String[] words = {"a", "bb", "b", "ccc"};
        System.out.println(lis.wordsWithoutList(words, 1));
    }
}
