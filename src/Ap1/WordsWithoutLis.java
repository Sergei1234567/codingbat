package Ap1;
import java.util.ArrayList;
import java.util.List;

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
