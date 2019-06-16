package ifrn.edu.diatinf.tads.poo.java.modelo;
import java.util.Scanner;


	public class ResgateAmigo {

	private Animal[] animais;
	private int qtdAnimais;
	private Voluntarios[] voluntarios;
	private int qtdVoluntarios;
	private Doacoes[] doacoes;
	private int qtdDoacoes;
	
	Scanner sc = new Scanner(System.in);
	
	public ResgateAmigo() {
		
		animais = new Animal[10];
		qtdAnimais = 0;
		
		voluntarios = new Voluntarios[10];
		qtdVoluntarios = 0;
		
		doacoes = new Doacoes[10];
		qtdDoacoes = 0;
		
	}
	
	// CLASSE ANIMAL
	public void CadastrarAnimal(Animal a) {
		animais[qtdAnimais] = a;
		qtdAnimais++;
	}
	
	public void CastrarAnimal(int numero) {
		Animal a = null;
		int castrado = 1;
		for (int i = 0; i < qtdAnimais; i++) {
			if (i == numero) {
				a = animais[i];
				if (a.getCastrado() == 1) {
					System.out.println("Esse Animal já foi castrado");
				}
				if (a.getCastrado() == 2) {
					a.setCastrado(castrado);
					System.out.println("Animal " + a.getNome() + " foi castrado com Sucesso");
				}
			}
		}
	}
		
	public void AdotarAnimal(int numero) {
		Animal a = null;
		String situacao = "Adotado";
		
		for (int i = 0; i < qtdAnimais; i++) {
			if (animais[i].getSituacao().equals("1")) {
				if(i == numero) {
					a = animais[i];
					System.out.println(a.getSituacao());
					a.setSituacao(situacao);
					System.out.println("Parabéns, "+ a.getNome() + " foi " + a.getSituacao());
				}
			}
		}
		if(a == null) {
			System.out.println("Desculpe, não encontramos esse animal");
		}
	}
	
	public void VacinarAnimal(int numero) {
		Animal a = null;
		int vacina = 1;
		
		for (int i = 0; i < qtdAnimais; i++) {
			if (i == numero) {
				a = animais[i];
				if (a.getVacina() == 1) {
					System.out.println("Esse Animal já foi vacinado");
				}
				if (a.getVacina() == 2) {
					a.setVacina(vacina);
					System.out.println("Animal " + a.getNome() + " foi vacinado com Sucesso");
				}
			}
		}
		
		if (a == null) {
			System.out.println("Desculpe, não encontramos esse animal");
		}
	}
	
	
	public int QtdAnimais() {
		return qtdAnimais;
	}
	
	// LISTAR ANIMAIS
	public boolean ListarAnimaisParaCastrar() {
		if (qtdAnimais == 0) {
			return false;
		}
		else {
			Animal a = null;
			for (int i = 0; i < qtdAnimais; i++) {
				if (animais[i].getCastrado() == 1) {
					a = animais[i];
					System.out.println(i + " - " + a.getNome() + " está castrado");
				}
				if (animais[i].getCastrado() == 2) {
					a = animais[i];
					System.out.println(i + " - " + a.getNome() + " não foi castrado");
				}
			}
			if (a == null) {
				return false;
			}
			return true;
		}
	}
	
	public boolean ListarAnimaisParaVacina() {
		if (qtdAnimais == 0) {
			return false;
		}
		else {
			Animal a = null;
			for (int i = 0; i < qtdAnimais; i++) {
				if (animais[i].getVacina() == 1) {
					a = animais[i];
					System.out.println(i + " - " + a.getNome() + " está vacinado");
				}
				if (animais[i].getVacina() == 2) {
					a = animais[i];
					System.out.println(i + " - " + a.getNome() + " não foi vacinado");
				}
			}
			if (a == null) {
				return false;
			}
			return true;
		}
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
	
	public boolean ListarAnimaisDisponiveis() {
		
		if(qtdAnimais == 0) {
			return false;
		}
		
		else {
			Animal a = null;
			for (int i = 0; i < qtdAnimais; i++) {
				if (animais[i].getSituacao().equals("1")) {
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
	
	public boolean ListarAnimaisTratamento() {
		if(qtdAnimais == 0) {
			return false;
		}
		else {
			Animal a = null;
			for (int i = 0; i < qtdAnimais; i++) {
				if (animais[i].getSituacao().equals("2")) {
					a = animais[i];
					System.out.println(i + " - " + a.getNome());
				}
			}
			if (a == null) {
				return false;
			}
			return true;
		}
	}
	
	
	// CLASSE VOLUNTÁRIOS
	public void CadastrarVoluntario(Voluntarios v) {
		voluntarios[qtdVoluntarios] = v;
		qtdVoluntarios++;
	}
	
	public void AlterarSituacaoVoluntario(int id) {
		Voluntarios v = null;
		for (int i = 0; i < qtdVoluntarios; i++) {
			if (i == id) {
				v = voluntarios[i];
				System.out.println("Voluntário: " + v.getNome() + "\nSituação: " + v.getSituacao());
				System.out.println("Atualizar Situação:\n1 - Ativo\n2 - Pausado\n3 - Desativo");
				int situacao = sc.nextInt();
				if (situacao > 3) {
					System.out.println("Situação Inválida");
				}
				else {
					v.setSituacao(situacao);
					System.out.println("Situação Atualizada com Sucesso");
				}
			}
		}
	}
	
	// LISTAR VOLUNTÁRIOS
	public boolean ListarTodosVoluntarios() {
		if (qtdVoluntarios == 0) {
			return false;
		}
		else {
			Voluntarios v = null;
			for (int i = 0; i < qtdVoluntarios; i++) {
				v = voluntarios[i];
				System.out.println(i + " - " + v.getNome());
			}
			return true;
		}
	}
	
	public boolean ListarVoluntariosAtivos() {
		if (qtdVoluntarios == 0) {
			return false;
		}
		else {
			Voluntarios v = null;
			for (int i = 0; i < qtdVoluntarios; i++) {
				if (voluntarios[i].getSituacao() == 1) {
					v = voluntarios[i];
					System.out.println(i + " - " + v.getNome());
				}
			}
			if (v == null) {
				return false;
			}
			return true;
		}
	}
	
	public boolean ListarVoluntariosPausados() {
		if (qtdVoluntarios == 0) {
			return false;
		}
		else {
			Voluntarios v = null;
			for (int i = 0; i < qtdVoluntarios; i++) {
				if (voluntarios[i].getSituacao() == 2) {
					v = voluntarios[i];
					System.out.println(i + " - " + v.getNome());
				}
			}
			if (v == null) {
				return false;
			}
			return true;
		}
	}
	
	public boolean ListarVoluntariosDesativos() {
		if (qtdVoluntarios == 0) {
			return false;
		}
		else {
			Voluntarios v = null;
			for (int i = 0; i < qtdVoluntarios; i++) {
				if (voluntarios[i].getSituacao() == 3) {
					v = voluntarios[i];
					System.out.println(i + " - " + v.getNome());
				}
			}
			if (v == null) {
				return false;
			}
			return true;
		}
	}
	
	
	// CLASSE DOAÇÕES
	public void CadastrarDoacoes(Doacoes d) {
		doacoes[qtdDoacoes] = d;
		qtdDoacoes++;
	}
	
	// LISTAR DOAÇÕES
	public String ListarDoacoes() {
		if (qtdDoacoes == 0) {
			return null;
		}
		else {
			Doacoes d = null;
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < qtdDoacoes; i++) {
				d = doacoes[i];
				
				sb.append("Nome: " + d.getNomeDoador());
				sb.append("\n");
				sb.append("CPF: "+ d.getCpfDoador());
				sb.append("\n");
				sb.append("Tipo da doação: "+ d.getTipoDoacao());
				sb.append("\n");
				sb.append("Doação: " + d.getDoacao());
				sb.append("\n");
				sb.append("Quantidade: " + d.getQtdDoacao());
				sb.append("\n");
				sb.append("Data da doação: " + d.getDataDoacao());
				sb.append("\n");
			}
			return sb.toString();
		}
	}

}
