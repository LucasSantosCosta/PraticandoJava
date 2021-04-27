
public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente paulo = new Gerente();
		paulo.setNome("Paulo");
		paulo.setCpf("22222.22");
		paulo.setSalario(5000.0);

		System.out.println(paulo.getNome());
		System.out.println(paulo.getCpf());
		System.out.println(paulo.getSalario());
		
		
		paulo.setSenha(2222);
		boolean autenticou = paulo.autentica(2222);
		System.out.println(autenticou);
		
		System.out.println("Bonificação gerente " + paulo.getBonificacao());
		
	}

}
