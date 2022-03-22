
import java.util.ArrayList;

public class ExecutarCadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Cadastro> cliente = new ArrayList();
		
		Cadastro cliente1 = new Cadastro(0565,"15874-8","Paulo","paulo@gmail.com.br","4221-5280",1500.00);
		Cadastro cliente2 = new Cadastro(0256,"06278-5","Maria","maria@gmail.com.br","5530-6970",1000.00);
        Cadastro cliente3 = new Cadastro(1274,"38753-3","Bruna","bruna@gmail.com.br","5780-6548",2800.00);
        Cadastro cliente4 = new Cadastro(3786,"20578-7","Julio","julio@gmail.com.br","4487-1151",3500.00);

        cliente.add(cliente1);
		cliente.add(cliente2);
		cliente.add(cliente3);
		cliente.add(cliente4);
		
		for(Cadastro c:cliente) {
			
			System.out.println("Agencia: "+c.getAgencia()+" , "+" Conta: "+c.getConta()+" , "+" Nome: "+c.getNome()+" , "+
			" Email: "+c.getEmail()+" , "+" Telefone: "+c.getTelefone()+" , "+" Saldo: "+c.getSaldo());
		}
		
		System.out.println("O Total de registro é "+cliente.size());
		
		
		
		System.out.println(cliente.get(3).getNome());
		
		System.out.println(cliente.get(2).getNome());
		
		}

}