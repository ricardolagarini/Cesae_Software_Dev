package Ficha_pratica_06;

public class ex_03 {


    /**
     * Método que avalia se um número é ou não impar
     * @param num Número a ser avaliado
     * @return True - se par || False - se impar
     */
    public static boolean par(int num){
        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Método que avalia se um um número é positivo
     * @param num - Número a ser avaliado
     * @return True - se zero ou positivo || False - se negativo
     */
    public static boolean positivo(int num){
        if(num>=0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Método que avalia se um número é ou não primo
     * @param num Número a ser avaliado
     * @return True - se primo || False - se não primo
     */
    public static boolean primo(int num){

        for(int divisor=2; divisor<num; divisor++){
            if(num%divisor==0){
                return false;
            }
        }
        return true;
    }

    /**
     * Método que avalia se um número é perfeito ou nao
     * @param num Número a ser avaliado
     * @return True - se perfeito || False - se não perfeito
     */
    public static boolean numeroPerfeito(int num) {
        int somaDivisores = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                somaDivisores += i;
            }
        }
        return somaDivisores == num;
    }

    /**
     * Método que avalia se um número Triangular ou nao
     * @param num Número a ser avaliado
     * @return True - se triangular || False - se não triangular
     */
    public static boolean numeroTriangular(int num) {
        int soma = 0;
        int i = 1;

        while (soma < num) {
            soma += i;
            i++;
        }
        return soma == num;
    }
}