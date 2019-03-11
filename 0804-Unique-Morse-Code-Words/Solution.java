import java.util.HashSet;
import java.util.Set;

/**
 * Solution
 *
 * @author Tian ZhongBo
 * @date 2019-03-11 23:19:43
 */
public class Solution {

    private String[] morses = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                sb.append(morses[word.charAt(i) - 'a']);
            }
            set.add(sb.toString());
        }

        return set.size();
    }
}
