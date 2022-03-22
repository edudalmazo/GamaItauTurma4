import java.util.Scanner;

public class CadastroCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner teclado = new Scanner(System.in);
		
		int opcao;
		
		System.out.println("Entre com a opção desejada");	
		opcao = teclado.nextInt();
		
		System.out.println("1 - Agencia");	
		System.out.println("2 - Conta");	
		System.out.println("3 - Nome");	
		System.out.println("4 - Email");
		System.out.println("5 - Telefone");	
		System.out.println("6 - Saldo");
		
		
		
		switch(opcao) {
		case 1:
			int agencia;
			System.out.println("Digite o número da agencia");
			agencia = teclado.nextInt();
			System.out.println("Numero da agencia do banco: "+agencia);
			break;
		case 2:
			String conta, digito;
			System.out.println("Digite o numero da conta");
			conta = teclado.next();
			System.out.println("Digite o numero do digito");
			digito = teclado.next();
			System.out.println("Numero da conta do banco: "+conta+"-"+digito);
			break;
		case 3:
			String nome, nome1;
			System.out.println("Digite o seu nome");
			nome = teclado.next();
			System.out.println("Digite o seu completo");
			nome1 = teclado.next();
			System.out.println("Nome completo: "+nome+" " + nome1);
			break;
		case 4:
			String email;
			System.out.println("Digite o seu numero do email");
			email = teclado.next();
			System.out.println("E-mail: "+ email);
			break;
		case 5:
			String telefone;
			System.out.println("Digite o seu numero do telefone");
			telefone = teclado.next();
			System.out.println("Numero do telefone: "+ telefone);
			break;
		case 6:
			Double saldo;
			System.out.println("Digite o valor do saldo");
			saldo = teclado.nextDouble();
			System.out.println("Saldo: "+ saldo);
			break;
		case 7:
			System.out.println("Sair");	
			break;
			default:
				System.out.println("Opção Inválida");	
		}
		
		
	   teclado.close();
	   
	   }

}
