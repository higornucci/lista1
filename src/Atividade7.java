public class Atividade7 {
    public static void main(String[] args) {
        int variavel1 = 10;
        int variavel2 = 15;

        System.out.println("O valor da variavel1 eh: " + variavel1);
        System.out.println("O valor da variavel2 eh: " + variavel2);

        int variavelAuxiliar = variavel1;
        variavel1 = variavel2;
        variavel2 = variavelAuxiliar;
        
        System.out.println("O valor trocado da variavel1 eh: " + variavel1);
        System.out.println("O valor trocado da variavel2 eh: " + variavel2);
    }
}
