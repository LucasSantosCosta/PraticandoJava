
public class ControleBonificacao {
	
	private double soma;	
	
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma += boni;
	}
	
	//public void registra(EditorDeVideo ev) {
		//double boni = ev .getBonificacao();
		//this.soma += boni;
	//}
	
	//public void registra(Gerente g) {
		//	double boni = g.getBonificacao();
		//	this.soma += boni;
		//}
	
	public double getSoma() {
		return this.soma;
	}
}
