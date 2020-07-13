/*Exerc�cio � Duas pessoas querem abrir uma conta no banco, o Jubileu e a Creusa. O Jubileu optou por abrir uma conta poupan�a, e ir� deposita 300 reais na sua conta. A Creusa, possuir mais dinheiro e quer depositar 500 reais em uma conta corrente. Para isso, eles precisam abrir uma conta no banco. Os atributos e m�todos da ContaBanco est�o expostos abaixo, com base nesse diagrama de classes.

Requisitos: 

1. O tipo da conta s� aceita dois caracteres, cc e cp. Conta corrente e conta poupan�a, respectivamente.
2. Na hora de abrir conta, eu mudo o status de falso para verdadeiro. � nesse momento que decido qual conta vou abrir, e caso seja uma cp j� recebe um presente de 150 reais, ou caso escolha abrir uma conta corrente, seu presente � de 50 reais.
3. Para fechar conta, o Jubileu ou a Creusa n�o v�o poder ter dinheiro dentro da sua conta.
4. Para fazer um dep�sito ou sacar, a conta j� deve ter sido aberta com status verdadeiro. No caso do saque, eu devo j� ter dinheiro dentro, e o valor do saque n�o deve ser superior ao seu saldo.
5. A mensalidade vai ser cobrada diretamente do saldo. Na hora que for chamado a mensalidade, o cliente com cc pagar� 12 reais, e o cliente com cp pagar� 20 reias de mensalidade.
6. Voc� precisar� usar o m�todo getter e setter para TODOS os atributos.
7.  � necess�rio ter um m�todo construtor, onde o seu status ser� definido como zero e o saldo definido como zero, pois a conta est� fechada.*/


/*Conta

+ numConta
# tipo (caracter, cc ou cp)
- dono
- saldo
- status (aberta ou fechada)

+ abrirConta() muda status para vdd ou falso
	Qual o tipo, 

	se conta corrente ganha 50
	se conta poupan�a ganha 150

+ fecharConta()
	tem que sacar o dinheiro
+ depositar()
	s� com saldo e conta aberta
+ sacar()
	n�o pode ser maior do que o saldo
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
	
	public Conta(boolean s, float sd) { // Este � o m�todo construtor
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
			System.out.println("N�o pode fechar a conta com saldo");
		}else {
			status = false;
			System.out.println("Conta fechada");
		}
	}
	
	public void depositar(float valorDeposito) {
		if(status == true) {
			this.saldo = saldo + valorDeposito;
		}else {
			System.out.println("N�o da para depositar com a conta fechada.");
		}			
		  
	}
	
	public void sacar(float valorSaque) {
		if(status == true) {
			this.saldo = saldo - valorSaque;
		}
		
		if(valorSaque > saldo) {
			System.out.println("N�o � poss�vel sacar");
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
