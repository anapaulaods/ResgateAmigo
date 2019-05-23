package ifrn.edu.diatinf.tads.poo.java.modelo;
import ifrn.edu.diatinf.tads.poo.java.modelo.*;

	public class ResgateAmigo {
	
	private Animal[] animais;
	private int qtdAnimais;
	private Voluntarios[] voluntarios;
	private int qtdVoluntarios;
	private Doacoes[] doacoes;
	private int qtdDoacoes;
	
	Animal animal = new Animal();
	
	//Animais
	
	public ResgateAmigo() {
		
		animais = new Animal[10];
		qtdAnimais = 0;
		
		voluntarios = new Voluntarios[10];
		qtdVoluntarios = 0;
		
		doacoes = new Doacoes[10];
		qtdDoacoes = 0;
		
	}
	
	public void CadastrarAnimal(Animal a) {
		animais[qtdAnimais] = a;
		qtdAnimais++;
	}
	
	public void CastraAnimal() {
		
	}
	
	public void AdotarAnimal(String nome) {
		Animal a = null;
		String situacao = "Adotado";
		
		for (int i = 0; i < qtdAnimais; i++) {	
			if(animais[i].getNome().equals(nome)) {
				a = animais[i];
				System.out.println(a.getSituacao());
				a.setSituacao(situacao);
				System.out.println("Parab�ns, "+ a.getNome() + " foi " + a.getSituacao());
			
			}
		}
		if(a == null) {
			System.out.println("Desculpe, n�o encontramos esse animal");
		}
	}
	
	public void VacinarAnimal() {
		
	}
	
	public int QtdAnimais() {
		return qtdAnimais;
	}
	
	public void ListarAnimaisAdotados() {
		
	}
	
	public Animal[] ListarAnimaisDisponiveis() {
		Animal a = null;
		if(qtdAnimais == 0) {
			System.out.println("N�o existem animais no sistema");	
		}
		else {
			for (int i = 0; i < qtdAnimais; i++) {
				if (animais[i].getSituacao().equals("1")) {
					a = animais[i];
					System.out.println(a.getNome());
				}
			}
			if(a == null) {
				System.out.println("Nenhum Animal dispon�vel para ado��o no momento");
			}
		}
		return null;
	}
	
	//Volunt�rios
	
	public void CadastrarVoluntario(Voluntarios v) {
		voluntarios[qtdVoluntarios] = v;
		qtdVoluntarios++;
	}
	
	public void AlterarSituacaoVoluntario() {
		
	}
	
	public void ListarVoluntariosAtivos() {
		
	}
	
	public void ListarVoluntariosPausados() {
		
	}
	
	public void ListarVoluntariosDesativos() {
	
	}
	
	//Doa��es
	
	public void CadastrarDoacoes(Doacoes d) {
		doacoes[qtdDoacoes] = d;
		qtdDoacoes++;
	}
	
	public void ListarDoacoes() {
		
	}

}
