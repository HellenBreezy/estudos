import java.util.Scanner;

public class ExerciciosCondicional05 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double intervalo = leitura.nextDouble();

        if (intervalo >= 0 && intervalo <= 25){
            System.out.println("Intervalo (25,50)");

        } else if (intervalo >= 25 && intervalo <= 50) {
            System.out.println("Intervalo (25,50)");

        }else if (intervalo >= 50 && intervalo <= 75) {
            System.out.println("Intervalo (50,75)");

        }else if (intervalo >= 75 && intervalo <= 100) {
            System.out.println("Intervalo (25,50)");

        }else{
            System.out.println("Fora de intervalo");
        }
    }
}
