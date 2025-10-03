import java.util.Scanner;

public class L405 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int paisA, paisB;
        double taxaA, taxaB;
        int anos;
        char repetir;

        do {
            anos = 0;

            do {
                System.out.print("Digite a população do país A: ");
                paisA = scanner.nextInt();
                if (paisA <= 0) {
                    System.out.println("População inválida. ");
                }
            } while (paisA <= 0);

            do {
                System.out.print("Digite a população do país B: ");
                paisB = scanner.nextInt();
                if (paisB <= 0) {
                    System.out.println("População inválida. ");
                }
            } while (paisB <= 0);

            do {
                System.out.print("Digite a taxa de crescimento do país A: ");
                taxaA = scanner.nextDouble();
                if (taxaA <= 0) {
                    System.out.println("Taxa inválida. ");
                }
            } while (taxaA <= 0);

            do {
                System.out.print("Digite a taxa de crescimento do país B: ");
                taxaB = scanner.nextDouble();
                if (taxaB <= 0) {
                    System.out.println("Taxa inválida. ");
                }
            } while (taxaB <= 0);

            taxaA = taxaA / 100;
            taxaB = taxaB / 100;

            while (paisA < paisB) {
                paisA += paisA * taxaA;
                paisB += paisB * taxaB;
                anos++;
            }

            System.out.println("O número de anos necessários para A ultrapassar B é: " + anos);

            System.out.print("\nDeseja repetir a operação? (s/n): ");
            repetir = scanner.next().toLowerCase().charAt(0);

        } while (repetir == 's');

        scanner.close();
    }
}
