
// Funcionario n�o � algo concreto, assim como Gerente ou Designer
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	
	//protected quer dizer que � publico para as classes filhas.
	private double salario;
	
	// metodo sem corpo, n�o h� implementa��o aqui na mae, s� nos filhos.
	public abstract double getBonificacao(); 
	
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
