import java.util.Scanner;

    public class Exercicio01 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int maior = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;
            int soma = 0;
            int contador = 0;


            do {
                System.out.print("Digite um valor inteiro: ");
                int valor = scanner.nextInt();

                if (valor > maior) {
                    maior = valor;
                }

                if (valor < menor) {
                    menor = valor;
                }

                soma += valor;

                contador++;

            } while (contador < 20);

            double media = (double) soma / 20;

            // Exibindo os resultados
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
            System.out.println("Média dos valores: " + media);

            scanner.close();
        }
    }

