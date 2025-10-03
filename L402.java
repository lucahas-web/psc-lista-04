import java.util.Scanner;

public class L402 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String user, senha;

        while (true){
            System.out.print("Digite o usuário: ");
            user = scanner.nextLine();
            System.out.print("Digite a senha: ");
            senha = scanner.nextLine();

            if (senha.equals(user)){
                System.out.println("Erro: a senha não pode ser igual ao nome de usuário. Tente novamente.\n");
            } else {
                System.out.print("Cadastro realizado com sucesso.");
                break;
            }
        }
         scanner.close();
    }
}
