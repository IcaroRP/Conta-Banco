import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        System.out.print("Por favor, digite o número da conta: ");
        int numero = sc.nextInt();
        System.out.print("Por favor, digite o número da agência: ");
        String agencia = sc.next();
        System.out.printf("Escreva seu nome: ");
        String nome = sc.next();
        System.out.print("Digite o seu saldo: ");
        double saldo = sc.nextDouble();

        //Exibir a mensagem da conta criada
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nome, agencia, numero, saldo);
        sc.close();
    }
}
