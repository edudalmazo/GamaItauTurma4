
public class Cadastro {
	
	private int agencia;
	private String conta;
	private String nome;
	private String email;
	private String telefone;
	private Double saldo;
	
	public Cadastro(int agencia, String conta, String nome, String email, String telefone, Double saldo) {
		this.agencia = agencia;
		this.conta = conta;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.saldo = saldo;
		
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	  
	public String getConta() {
		return conta;
	}
	
	public void setConta(String conta) {
		this.conta = conta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	
	

}
