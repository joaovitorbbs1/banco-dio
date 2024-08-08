
public class Principal {
	public static void main(String[] args) {
		Banco bancoDigital = new Banco();
		
		bancoDigital.setNome("Banco Digital");
		
		Cliente cliente1 = new Cliente("Joao");
		Cliente cliente2 = new Cliente("Maria");
		
		Conta cc = new ContaCorrente(cliente1);
		Conta cp = new ContaPoupanca(cliente2);
		
		bancoDigital.adicionarContas(cp);
		bancoDigital.adicionarContas(cc);
		
		cc.depositar(1000);
		cp.depositar(250);

		cc.transferir(100, cp);
		cp.transferir(250, cp);
		
		System.out.println(bancoDigital.exibirContas()); 
	}
}
