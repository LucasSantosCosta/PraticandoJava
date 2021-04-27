//Gerente é um Funcionario, gerente herda alguns atributos da class FuncionarioAutenticavel
	//Gerente assina o contrato Autenticavel, tem que atender as obrigações, implementar seus metodos abstratos
		//Gerente é um Autenticavel
//sobrecarga //overload, quando reaproveito um método existente e passo mais parametros.
	
	//reescrita, esse metodo pertence a classe mae, mas reescrevemos na
	//classe filha.
	
	//super é referencia para o atributo da classe mãe (Funcionario).

public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {		
		System.out.println("Chamando o metodo de bonificacao do Gerente");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.autentica(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	


}
