import java.util.Scanner;

public class ExerciciosCondicional02 {
    public static void main(String[] args) {
        //Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
        //Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
        //ordem crescente ou decrescente

        Scanner leitura = new Scanner(System.in);

        int numUm = leitura.nextInt();
        int numDois = leitura.nextInt();

        if (numUm % numDois == 0 || numDois % numUm == 0) {
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao sao Multiplos");
        }

    }
}
