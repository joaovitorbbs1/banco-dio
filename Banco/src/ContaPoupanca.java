import java.util.Scanner;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua senha");
		if (this.senha == sc.nextInt()) {
			if(valor > this.getSaldo()) {
				System.out.println("Valor superior ao saldo em conta.");
				System.out.println("Transferência cancelada!");
			} else {
				contaDestino.depositar(valor);
				this.saldo = getSaldo() - valor;
			}
			
		} else {
			System.out.println("Senha invalida!");
			System.out.println("Transferência cancelada!");
		}
		
	}
}