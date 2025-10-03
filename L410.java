import java.util.Scanner;

public class L410 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, inicio, fim;

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextInt();

        inicio = Math.min(num1, num2);
        fim = Math.max(num1, num2);

        System.out.println("Números no intervalo entre " + inicio + " e " + fim + ":");

        for (int i = inicio + 1; i < fim; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
