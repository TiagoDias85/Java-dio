import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:

        //Exibir a mensagem para nosso usuário

        //Obter pela classe Scanner os valores digitados no Terminal

        //Exibir a mensagem da conta criada
        
        int conta = 0;
        String agencia = " ";
        String cliente = " ";
        double saldo = 237.80;
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o numero da sua Conta: ");
            conta = sc.nextInt() ;
            
            System.out.println("Insira o número de sua Agência: ");
            agencia = sc.next() ;

            System.out.println("Digite seu nome: ");
            cliente = sc.next() ;

            
        }

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + conta + " e seu saldo de " + saldo + " já está disponível para saque.");
       
        }
        
    }

