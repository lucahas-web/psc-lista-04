import java.util.Scanner;

public class L408 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        double media = 0;

        for (int i = 1; i <= 5; i++){
            System.out.print("Digite o " + i + "º número: ");
             int numero = scanner.nextInt();
             soma += numero;

             media = (double) soma / 5;
        }

        System.out.println("A soma dos números é " + soma);
        System.out.println("A média dos números é " + media);
    }
    
}
