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
	Voluntarios voluntario = new Voluntarios();
	
	//ANIMAIS
	
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
	
	public void CastrarAnimal() {
		
	}
	
	public void AdotarAnimal(String nome) {
		Animal a = null;
		String situacao = "adotado";
		
		for (int i = 0; i < qtdAnimais; i++) {	
			if(animais[i].getNome().equals(nome)) {
				a = animais[i];
				System.out.println(a.getSituacao());
				a.setSituacao(situacao);
				System.out.println("Parabéns, "+ a.getNome() + " foi " + a.getSituacao());
			
			}
		}
		if(a == null) {
			System.out.println("Desculpe, não encontramos esse animal.");
		}
	}
	
	public void VacinarAnimal() {
		
	}
	
	public int QtdAnimais() {
		return qtdAnimais;
	}
	
	public boolean ListarAnimaisAdotados() {
		
		if(qtdAnimais == 0) {
			return false;
		}
		else {
			Animal a = null;
			for (int i = 0; i < qtdAnimais; i++) {
				if (animais[i].getSituacao().equals("Adotado")) {
					a = animais[i];
					System.out.println(i + " - " + a.getNome());
				}
			}
			if(a == null) {
				return false;
			}
			return true;
		}
	}
	
	public Animal[] ListarAnimaisDisponiveis() {
		Animal a = null;
		if(qtdAnimais == 0) {
			System.out.println("Não existem animais no sistema");	
		}
		else {
			for (int i = 0; i < qtdAnimais; i++) {
				if (animais[i].getSituacao().equals("1")) {
					a = animais[i];
					System.out.println(a.getNome());
				}
			}
			if(a == null) {
				System.out.println("Nenhum animal disponível para adoção no momento");
			}
		}
		return null;
	}
	
	public Animal[] ListarAnimaisEmTratamento() {
		Animal a = null;
		if(qtdAnimais == 0) {
			System.out.println("Não existem animais no sistema");	
		}
		else {
			for (int i = 0; i < qtdAnimais; i++) {
				if (animais[i].getSituacao().equals("2")) {
					a = animais[i];
					System.out.println(a.getNome());
				}
			}
			if(a == null) {
				System.out.println("Nenhum animal em tratamento no momento");
			}
		}
		return null;
	}
	
	//VOLUNTÁRIOS
	
	public void CadastrarVoluntario(Voluntarios v) {
		voluntarios[qtdVoluntarios] = v;
		qtdVoluntarios++;
	}
	
	public void AlterarSituacaoVoluntario() {
		
	}
	
	public Voluntarios[] ListarVoluntariosAtivos() {
		Voluntarios v = null;
		if(qtdVoluntarios == 0) {
			System.out.println("Não existem voluntários cadastrados no sistema.");
		}
		else {
			for(int i = 0; i < qtdVoluntarios; i++) {
				if (voluntarios[i].getSituacao().equals("1")) {
					v = voluntarios[i];
					System.out.println(v.getNome() + " : "  + v.getTelefone() + " : " + v.getDisponibilidade() + " : " + v.getFuncao());
				}
			}
			if (v == null) {
				System.out.println("Não existem voluntários ativos cadastrados no sistema.");
			}
		}
		return null;
		
	}
	
	public Voluntarios[] ListarVoluntariosPausados() {
		Voluntarios v = null;
		if(qtdVoluntarios == 0) {
			System.out.println("Não existem voluntários cadastrados no sistema.");
		}
		else {
			for(int i = 0; i < qtdVoluntarios; i++) {
				if (voluntarios[i].getSituacao().equals("2")) {
					v = voluntarios[i];
					System.out.println(v.getNome());
				}
			}
			if (v == null) {
				System.out.println("Não existem voluntários ativos cadastrados no sistema.");
			}
		}
		return null;
		
	}
	
	public Voluntarios[] ListarVoluntariosDesativos() {
		Voluntarios v = null;
		if(qtdVoluntarios == 0) {
			System.out.println("Não existem voluntários cadastrados no sistema.");
		}
		else {
			for(int i = 0; i < qtdVoluntarios; i++) {
				if (voluntarios[i].getSituacao().equals("3")) {
					v = voluntarios[i];
					System.out.println(v.getNome());
				}
			}
			if (v == null) {
				System.out.println("Não existem voluntários ativos cadastrados no sistema.");
			}
		}
		return null;
	
	}
	
	//DOAÇÕES
	
	public void CadastrarDoacoes(Doacoes d) {
		doacoes[qtdDoacoes] = d;
		qtdDoacoes++;
	}
	
	public void ListarDoacoes() {
		
	}

}
