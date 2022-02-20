/**

 * Question Three:
 * Dada uma string qualquer, desenvolva um algoritmo que encontre o numero de pares de substrings que sao anagramas.
 * Exemplo 1:
 * Input: ovo
 * Output: 2
 * [o, o], [ov, vo]
 *
 * Exemplo2:
 * Input: ifailuhkqq
 * Output: 3
 * [i, i], [q, q], [ifa, fai]
 *
 * @author Rebeca Palmeira
 * @version 1.0.0
 *
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChallengeThree {

    /**
     *
     * @param string    param to be tested por anagrams
     * @return  number representing the pairs of anagrams found within the string passed as a param
     *
     * @see #breakStringIntoSubstrings(String, Integer)
     * @see #countAnagrams(List)
     */
    public Integer testForAnagrams(String string) {
        Integer i = 1;
        Integer anagramsCounter = 0;

        while (breakStringIntoSubstrings(string, i).size() > 1) {
            anagramsCounter += countAnagrams(breakStringIntoSubstrings(string, i));
            i++;
        }
        return anagramsCounter;
    }

    /**
     *
     * @param str   string to be broken into substrings the size of the pace param
     * @param pace  Integer representing the size of each substring
     * @return  a list of substrings broken from str param
     *
     * @see #sortSubstring(String)
     */
    private List<String> breakStringIntoSubstrings(String str, Integer pace) {
        List<String> listOfSubstrings = new ArrayList<>();
        for (int i = 0; i <= str.length()-pace; i++) {
            listOfSubstrings.add(sortSubstring(str.substring(i, (i + pace))));
        }
        return listOfSubstrings;
    }

    /**
     *
     * @param string    break string into chars and sort them
     * @return          sorted string
     */
    private String sortSubstring(String string) {
        char[] stringToChar = string.toCharArray();
        Arrays.sort(stringToChar);
        return new String(stringToChar);
    }

    /**
     *
     * @param listOfSubstrings
     * @return  count of pairs of anagrams
     *
     * @see #sortSubstring(String)
     */
    private Integer countAnagrams(List<String> listOfSubstrings) {
        Integer anagramsCounted = 0;
        for(int i = 0; i < listOfSubstrings.size()-1; i++) {
            for (int j = i+1; j < listOfSubstrings.size(); j++) {
                if(sortSubstring(listOfSubstrings.get(i))
                        .equals(sortSubstring(listOfSubstrings.get(j)))) {

                    anagramsCounted++;
                }
            }
        }
        return anagramsCounted;
    }
}
