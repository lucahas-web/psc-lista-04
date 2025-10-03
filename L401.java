import java.util.Scanner;

public class L401 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int nota;

        while (true){
            System.out.print("Digite a nota: ");
            nota = scanner.nextInt();

            if (nota >= 0 && nota <= 10){
                System.out.print("Nota válida: " + nota);
                break;
            } else {
                System.out.print("Nota inválida. Tente novamente. ");
            }
        }
         scanner.close();
    }
}
