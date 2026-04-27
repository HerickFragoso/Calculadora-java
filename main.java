import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero para somar:");
        int numero1 = scan.nextInt();

        System.out.println("Digite o segundo numero para somar:");
        int numero2 = scan.nextInt();

        Calculos calc = new Calculos(0);

        int resposta = calc.somar(numero1, numero2);

        System.out.println("Resultado da soma: " + resposta);

        scan.close();
    }
}