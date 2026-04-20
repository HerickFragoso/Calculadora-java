import java.util.Scanner;

public class main {
    public static  void main(String []args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero para descobrir a sua taboada");
        int numero = scan.nextInt();
        for (int i=0; i <= 10; i++){
            int valoraexibir;
            int numeroParaMultiplicar = i;
            valoraexibir = numeroParaMultiplicar * numero;
            System.out.println(numero + "X" + numeroParaMultiplicar + "=" + valoraexibir);
        }
    }
}
