import java.util.Scanner;

public class ExerciciosCondicional04 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int codigo;
        int quantidade;
        double valor = 0;
        
        int codCachorroQuente = 1;
        double valorCachorroQuente = 4.00;
        int codXSalada = 2;
        double valorXSalada = 4.50;
        int codXBacon = 3;
        double valorXBacon = 5.00;
        int codTorradaSimples = 4;
        double valorTorradaSimples = 2.00;
        int codRefrigerante = 5;
        double valorRefrigerante = 1.50;
        
        System.out.println("Insira qual o codigo");
        codigo = leitura.nextInt();
        System.out.println("Insira a quantidade");
        quantidade = leitura.nextInt();
        
        if (codigo == codCachorroQuente){
            valor = valorCachorroQuente * (double) quantidade;

        } else if (codigo == codXSalada) {
            valor = valorXSalada * (double) quantidade;
            
        } else if (codigo == codXBacon) {
            valor = valorXBacon * (double) quantidade;

        } else if (codigo == codTorradaSimples) {
            valor = valorTorradaSimples * (double) quantidade;

        } else if (codigo == codRefrigerante) {
            valor = valorRefrigerante * (double) quantidade;

        }
        System.out.printf("Total: R$ %.2f", valor);


    }
}
