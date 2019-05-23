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
	
	public void AdotarAnimal(int id) {

	}
	
	public void VacinarAnimal() {
		
	}
	
	public int QtdAnimais() {
		return qtdAnimais;
	}
	
	public void ListarAnimaisAdotados() {
		
	}
	
	public Animal[] ListarAnimaisDisponiveis() {
		if(qtdAnimais == 0) {
			System.out.println("Não existem animais no sistema");	
		}
		else {
			for (int i = 0; i < qtdAnimais; i++) {
				if (animais[i].getSituacao().equals("1")) {
					System.out.println(animais[i].getNome());
				}
				
			}
		}
		return null;
	}
	
	//Voluntários
	
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
	
	//Doações
	
	public void CadastrarDoacoes(Doacoes d) {
		doacoes[qtdDoacoes] = d;
		qtdDoacoes++;
	}
	
	public void ListarDoacoes() {
		
	}

}
