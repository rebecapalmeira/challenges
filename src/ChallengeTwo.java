/**
 * Debora se inscreveu em uma rede social para se manter em contato com seus amigos. A pagina de cadastro exigia o preenchimento dos campos de nome e senha,
 *  porem a senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes criterios:
 * Possui no mínimo 6 caracteres.
 * Contem no mínimo 1 digito.
 * Contem no mínimo 1 letra em minusculo.
 * Contem no mínimo 1 letra em maiusculo.
 * Contem no mínimo 1 caractere especial. Os caracteres especiais sao: !@#$%^&*()-+
 * Debora digitou uma string aleatoria no campo de senha, porem ela não tem certeza se eh uma senha forte. Para ajudar Débora,
 *  construa um algoritmo que informe qual eh o número minimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.
 *
 * Exemplo:
 * Entrada:
 * Ya3
 *
 * Saida:
 * 3
 *
 * @author Rebeca Palmeira
 * @version 1.0.0
 *
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ChallengeTwo {

    /**
     *
     * @param password String to be tested for valid length and characters
     * @return Integer representing how many valid characters the password is lacking to be considered strong and valid
     * @see #findLengthToComplete(String)
     * @see #findUpperCaseLetter(String)
     * @see #findLowerCaseLetter(String)
     * @see #findDigits(String)
     * @see #findSpecialCharacters(String)
     */
    public Integer validatePassword(String password) {
        Integer lengthToComplete = findLengthToComplete(password);
        Integer missingRequiredCharacters = findUpperCaseLetter(password)
                + findLowerCaseLetter(password)
                + findDigits(password)
                + findSpecialCharacters(password);
        return Math.max(lengthToComplete, missingRequiredCharacters);
    }


    /**
     *
     * @param password String to be tested for valid length
     * @return Integer representing how many characters the password is lacking to be considered valid
     * @see #regexTest(String, String)
     */
    private Integer findLengthToComplete(String password) {
        Integer lengthToComplete = (6 - password.length());
        if(lengthToComplete < 0) {
            return 0;
        } else return lengthToComplete;
    }

    /**
     *
     * @param password String to be tested for presence of lowercase character
     * @return Integer 0 if no lowercase is found, 1 if at least one lowercase is found
     * @see #regexTest(String, String)
     */
    private Integer findLowerCaseLetter(String password) {
        return regexTest("[a-z]", password) ? 0 : 1;
    }

    /**
     *
     * @param password String to be tested for presence of uppercase character
     * @return Integer 0 if no uppercase is found, 1 if at least one uppercase is found
     * @see #regexTest(String, String)
     */
    private Integer findUpperCaseLetter(String password) {
        return regexTest("[A-Z]", password) ? 0 : 1;
    }

    /**
     *
     * @param password String to be tested for presence of digit
     * @return Integer 0 if no digit is found, 1 if at least one digit is found
     * @see #regexTest(String, String)
     */
    private Integer findDigits(String password) {
        return regexTest("[0-9]", password) ? 0 : 1;
    }

    /**
     *
     * @param password String to be tested for presence of special character
     * @return Integer 0 if no special character is found, 1 if at least one special character is found
     * @see #regexTest(String, String)
     */
    private Integer findSpecialCharacters(String password) {
        return regexTest("[!@#$%^&*()-+]", password) ? 0 : 1;
    }

    /**
     *
     * @param regexPattern String with pattern to be tested against password for match
     * @param password String to be tested
     * @return Boolean true if a match between password end regex pattern is found, false if no match is found
     * @see Pattern
     * @see Matcher
     */
    private boolean regexTest(String regexPattern, String password) {
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }
}

