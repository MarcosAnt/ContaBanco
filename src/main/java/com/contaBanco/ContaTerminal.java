import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		Integer conta = new Integer(0);
		String agencia = new String();
		String nomeCliente = new String();
		Double saldo = new Double(0);
		
		System.out.println("\n============================================================================\n");
		System.out.println("Por favor digite o Numero da Conta:");
		conta = sc.nextInt();
		sc.nextLine(); // Consome a quebra de linha pendente

		System.out.println("Por favor digite a Agencia:");
		agencia = sc.nextLine();
		
		System.out.println("Por favor digite o Nome do Cliente:");
		nomeCliente = sc.nextLine();
		
		System.out.println("Por favor digite o Saldo:");
		saldo = sc.nextDouble();
		sc.nextLine(); // Consome a quebra de linha pendente
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.\n", nomeCliente, agencia, conta, saldo);
		System.out.println("\n============================================================================\n");
		
		sc.close();
	}

}