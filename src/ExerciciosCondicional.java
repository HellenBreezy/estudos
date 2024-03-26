import java.util.Scanner;

public class ExerciciosCondicional {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int num = leitura.nextInt();

        if (num < 0){
            System.out.println("Negativo");
        }else{
            System.out.println("Não negativo");
        }
    }
}
