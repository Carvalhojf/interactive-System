import java.util.Scanner;

public class InteractiveSystem {
    public static void main(String[] args) {

        System.out.println("olá, sejam muito bem vindos");

        Scanner scanner = new Scanner(System.in);

        System.out.println("informe seu nome completo.");
        String nome = scanner.nextLine();

        System.out.println("Qual a sua idade?");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Qual o seu CPF?");
        String cpf = scanner.nextLine();

        System.out.println("Qual o seu peso?");
        int peso = scanner.nextInt();

        System.out.println("Qual a sua altura?");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Qual o seu estado civil?");
        String ec = scanner.nextLine();

        System.out.println("É PCD?");
        boolean pcd = scanner.nextBoolean();
        scanner.close();

        System.out.println("O seu nome é: " + nome + ",A sua idade é; " + idade + ",Seu cpf é: " + cpf + ",O seu peso é: " + peso + ",A sua altura é: " + altura + ",Seu estado civil é: " + ec + ",É PCD: " + pcd);

    }
}
