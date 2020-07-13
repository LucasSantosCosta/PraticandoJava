/*Exercício – Duas pessoas querem abrir uma conta no banco, o Jubileu e a Creusa. O Jubileu optou por abrir uma conta poupança, e irá deposita 300 reais na sua conta. A Creusa, possuir mais dinheiro e quer depositar 500 reais em uma conta corrente. Para isso, eles precisam abrir uma conta no banco. Os atributos e métodos da ContaBanco estão expostos abaixo, com base nesse diagrama de classes.

Requisitos: 

1. O tipo da conta só aceita dois caracteres, cc e cp. Conta corrente e conta poupança, respectivamente.
2. Na hora de abrir conta, eu mudo o status de falso para verdadeiro. É nesse momento que decido qual conta vou abrir, e caso seja uma cp já recebe um presente de 150 reais, ou caso escolha abrir uma conta corrente, seu presente é de 50 reais.
3. Para fechar conta, o Jubileu ou a Creusa não vão poder ter dinheiro dentro da sua conta.
4. Para fazer um depósito ou sacar, a conta já deve ter sido aberta com status verdadeiro. No caso do saque, eu devo já ter dinheiro dentro, e o valor do saque não deve ser superior ao seu saldo.
5. A mensalidade vai ser cobrada diretamente do saldo. Na hora que for chamado a mensalidade, o cliente com cc pagará 12 reais, e o cliente com cp pagará 20 reias de mensalidade.
6. Você precisará usar o método getter e setter para TODOS os atributos.
7.  É necessário ter um método construtor, onde o seu status será definido como zero e o saldo definido como zero, pois a conta está fechada.*/


/*Conta

+ numConta
# tipo (caracter, cc ou cp)
- dono
- saldo
- status (aberta ou fechada)

+ abrirConta() muda status para vdd ou falso
	Qual o tipo, 

	se conta corrente ganha 50
	se conta poupança ganha 150

+ fecharConta()
	tem que sacar o dinheiro
+ depositar()
	só com saldo e conta aberta
+ sacar()
	não pode ser maior do que o saldo
+ pagarMensal()
	cc = 12
	cp =20

get e set */



package com.cursoemvideo.exerciciobanco;

public class Conta {
	public int numConta;
	protected String tipoConta;
	private String dono;
	private float saldo;
	private boolean status;
	
	public Conta(boolean s, float sd) { // Este é o método construtor
		this.status = s;
		this.saldo = sd;		
	}
	
	public int getNumConta() {
		return this.numConta;
	}
	
	public void setNumConta(int c) {
		this.numConta = c;
	}
	
	public String getTipoConta() {
		return this.tipoConta;
	}
	
	public void setTipoConta(String tp) {
		this.tipoConta = tp;
	}
	
	public String getDono() {
		return this.dono;
	}
	
	public void setDono(String d) {
		this.dono = d;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(float s) {
		this.saldo = s;
	}
	
	public boolean getStatus() {
		return this.status;
	}
	
	public void setStatus(boolean stt) {
		this.status = stt;
	}
	
	public void abrirConta() {
		status = true;
		if(tipoConta == "cc") {
			this.saldo = saldo + 50;
		}else if(tipoConta == "cp") {
			this.saldo = saldo + 150;
		}
	}
	
	public void fecharConta() {
		if(saldo > 0) {
			System.out.println("Não pode fechar a conta com saldo");
		}else {
			status = false;
			System.out.println("Conta fechada");
		}
	}
	
	public void depositar(float valorDeposito) {
		if(status == true) {
			this.saldo = saldo + valorDeposito;
		}else {
			System.out.println("Não da para depositar com a conta fechada.");
		}			
		  
	}
	
	public void sacar(float valorSaque) {
		if(status == true) {
			this.saldo = saldo - valorSaque;
		}
		
		if(valorSaque > saldo) {
			System.out.println("Não é possível sacar");
		} 
		
	}
	
	public void pagarMensal() {
		if(tipoConta == "cc"){
			saldo = saldo - 12;
		} else if(tipoConta == "cp") {
			saldo = saldo - 20;
		}
			
	}

}
