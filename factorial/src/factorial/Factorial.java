/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author Samuel
 */
public class Factorial {

    public static void main(String[] args) {

        int valorMultiplicado;
        int factorial;

        valorMultiplicado = 8;

        int i;
        if (valorMultiplicado == 0) {
            factorial = 1;
        } else {
            factorial = 1;
            for (i = valorMultiplicado; i >= 1; i--) {
                factorial = factorial * i;
            }
        }

        System.out.println(factorial);
    }
}
