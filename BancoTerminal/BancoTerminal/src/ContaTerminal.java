import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Por favor, digite o número da agência!");
        int NumeroConta = entrada.nextInt();
    
        
        System.out.println("Digite o número de agência!");
        String Agencia = entrada.next();
        entrada.nextLine(); 
        
        System.out.println("Informe o valor a ser depositado!");
        double saldo = entrada.nextDouble();
        entrada.nextLine(); 
        System.out.println("Informe seu nome"); 
        String nomeCliente = entrada.nextLine(); 
        
        ContaBanco conta = new ContaBanco();
        conta.CriarConta(NumeroConta, Agencia, nomeCliente, saldo);
        System.out.println(conta.status());
        
        entrada.close();
    }
}
