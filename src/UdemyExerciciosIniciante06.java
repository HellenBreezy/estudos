import java.util.Scanner;

public class UdemyExerciciosIniciante06 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Quantas horas?");

        int hora = leitura.nextInt();

        if (hora < 12){
            System.out.println("Bom dia");
        }
        else if (hora < 18) {
            System.out.println("Boa tarde");

        } else{
            System.out.println("Boa noite");
        }

    }
}
