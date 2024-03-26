import java.util.Scanner;

public class ExerciciosCondicional06 {
    public static void main(String[] args) {
        //Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
        //seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
        //nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira o valor X: ");
        double x = leitura.nextDouble();
        System.out.println("Insira o valor Y: ");
        double y = leitura.nextDouble();

        if(x == 0 && y == 0){
            System.out.println("Origem");

        } else if (x > 0 && y == 0) {
            System.out.println("Eixo X");

        } else if (y > 0 && x == 0) {
            System.out.println("Eixo Y");

        }else if (x > 0 && y < 0){
            System.out.println("Q4");

        }else if (x < 0 && y < 0) {
            System.out.println("Q3");

        }else if (y > 0 && x < 0) {
            System.out.println("Q2");

        }else{
            System.out.println("Q1");
        }
    }
}
