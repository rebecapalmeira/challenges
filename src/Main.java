/**
 * @author Rebeca Palmeira
 * @version 1.0.0
 *
 *
 *
 */

public class Main {

    public static void main(String[] args) {

        ChallengeOne stairs = new ChallengeOne();
        ChallengeTwo validatePassword = new ChallengeTwo();
        ChallengeThree numberOfAnagrams = new ChallengeThree();

        //=================================================================
        //variables to use as params
        Integer steps = 6;//param to Challenge One
        String password = "Ya3";//param to Challenge Two
        String anagram = "ifailuhkqq";//param to Challenge Three

        //=================================================================
        //calling functions to run code for three challenges
        System.out.println("Answer to Challenge One:" +
                "\nInput: " + steps +
                "\nOutput:");
        stairs.printStairs(steps);

        System.out.println("\n================================================================================\n");

        System.out.println("Answer to Challenge Two:" +
                "\nInput(password): " + password +
                "\nOutput(number of characters lacking to build a strong and valid password): " + validatePassword.validatePassword(password));

        System.out.println("\n================================================================================\n");

        System.out.println("Answer to Challenge Three:" +
                "\nInput(string): " + anagram +
                "\nOutput(number of anagrams found within given string): " + numberOfAnagrams.testForAnagrams(anagram));

    }

}
