package EXAMPLES;
import java.util.*;
public class GroupAnagrams {

    public static List<List<String>> groupanagrams(String[] words){
        Map<String, List<String>> anagramMap = new HashMap<>();
        for(String word: words){
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            anagramMap.computeIfAbsent(key, k->new ArrayList<>()).add(word);
        
        }
        return new ArrayList<>(anagramMap.values());
    }
    public static void main(String[] args) {
        String[] words = {"bat","tab","cat","act","dog","god"};
        System.out.print(groupanagrams(words));
    }
}