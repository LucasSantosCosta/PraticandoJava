
public class TesteFuncionario {

	public static void main(String[] args) {

		Gerente lucas = new Gerente();
		lucas.setNome("Lucas Santos");
		lucas.setCpf("233333333-9");
		lucas.setSalario(5800.0);
		lucas.setSenha(1234);
		
		System.out.println(lucas.getNome());
		System.out.println(lucas.getBonificacao());		
		
		
		SistemaInterno si = new SistemaInterno();		
		si.autentica(lucas);
		
		
		
	}

}
