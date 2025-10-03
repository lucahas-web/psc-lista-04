import java.util.Scanner;

public class L403 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String nome;
        char ec, sexo;
        int idade;
        double salario;

        do {
            System.out.print("Digite o seu nome(pelo menos 3 caracteres): ");
            nome = scanner.nextLine();
            if (nome.length() <= 3) {
                System.out.print("Nome inválido. Tente novamente: ");
            }
        } while (nome.length() <= 3);

        do {
           System.out.print("Digite a sua idade: ");
           idade = scanner.nextInt();
           if (idade < 0 || idade > 150) {
            System.out.print("Idade inválida. Tente novamente: ");
           } 
        } while (idade < 0 || idade > 150);

        do {
           System.out.print("Digite o seu salário: ");
           salario = scanner.nextDouble();
           if (salario <= 0) {
            System.out.print("Salário inválido. Tente novamente: ");
           } 
        } while (salario <= 0);

        scanner.nextLine();

        do {
            System.out.print("Digite o seu sexo, usando 'f' ou 'm': ");
            sexo = scanner.nextLine().toLowerCase().charAt(0);
            if (sexo != 'f' && sexo != 'm'){
                System.out.println("Nosso sistema é ultrapassado e só aceita dois sexos. Tente novamente. ");
            }
        } while (sexo != 'f' && sexo != 'm');

        do {
            System.out.print("Digite seu estado civil usando 'c', 's', 'd' ou 'v': ");
            ec = scanner.nextLine().toLowerCase().charAt(0);
            if (ec != 'c' && ec != 's' && ec != 'd' && ec != 'v'){
                System.out.println("Estado civil inválido. Tente novamente: ");
            }
        } while (ec != 'c' && ec != 's' && ec != 'd' && ec != 'v');

        System.out.print("Cadastro realizado com sucesso.");
        System.out.println("O seu nome é: " + nome);
        System.out.println("A sua idade é: " + idade);
        System.out.println("O seu salário é: " + salario);
        System.out.println("O seu sexo é: " + sexo);
        System.out.println(" O seu estado civil é: " + ec);
        
         scanner.close();
    }
}
