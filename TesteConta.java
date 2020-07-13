package com.cursoemvideo.exerciciobanco;

public class TesteConta {

	public static void main(String[] args) {
		Conta c1 = new Conta(false, 0);
		c1.numConta = 2856;
		c1.tipoConta = "cc";
		
		c1.abrirConta();
		
		System.out.println("Status: " + c1.getStatus());
		System.out.println("Saldo Inicial: " + c1.getSaldo());
		
		//c1.fecharConta();
		
		c1.depositar(500);
		System.out.println("Saldo após depósito: " + c1.getSaldo());
		
		c1.sacar(100);
		System.out.println("Saldo após saque: " + c1.getSaldo());
		
		c1.fecharConta();
		
		c1.pagarMensal();
		System.out.println("Saldo após pagar mensal: " + c1.getSaldo());
		
		Conta c2 = new Conta(false, 0);
		c2.numConta = 1234;
		c2.tipoConta = "cp";
		
		c2.abrirConta();		
		
		System.out.println("Status da Conta 2: " + c2.getStatus());
		System.out.println("Saldo Inicial da Conta 2: " + c2.getSaldo());
		
		c2.depositar(230);
		System.out.println("Saldo após depósito: " + c2.getSaldo());
		
		c2.pagarMensal();
		System.out.println("Saldo após pagar mensal: " + c2.getSaldo());
		
		c2.sacar(380);
		System.out.println("Saldo após saque: " + c2.getSaldo());		
		
		
		c2.fecharConta();
		
		Conta c3 = new Conta(false, 0);
		c3.fecharConta();		
		c3.numConta = 4444;
		c3.tipoConta = "cc";

		c3.abrirConta();
		System.out.println("Status da Conta: " + c3.getNumConta() + c3.getStatus());
		System.out.println("Saldo Inicial da Conta 2: " + c3.getSaldo());
	}

}
