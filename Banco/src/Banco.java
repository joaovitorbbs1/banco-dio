import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	
	
	public Banco() {
		contas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> exibirContas() {
		return contas;
	}

	public void adicionarContas(Conta conta) {
		contas.add(conta);
	}

}