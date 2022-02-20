/**
 * Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espacos.
 * A base e altura da escada devem ser iguais ao valor de n. A ultima linha nao deve conter nenhum espaco.
 * Exemplo:
 * Entrada
 * n = 6;
 *
 * Saída:
 *      *
 *     **
 *    ***
 *   ****
 *  *****
 * ******
 *
 * @author Rebeca Palmeira
 * @version 1.0.0
 */

public class ChallengeOne {

    /**
     *
     * @param steps number of lines representing the steps of the stairs
     */
    public void printStairs(int steps){
        for (int lineCounter = 1; lineCounter <= steps; lineCounter++) {
            for(int spaceCounter = steps-lineCounter; spaceCounter > 0; spaceCounter--) {
                System.out.print(" ");
            }
            for(int starCounter = lineCounter; starCounter > 0; starCounter--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
