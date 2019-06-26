package ifrn.edu.diatinf.tads.poo.java.modelo;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import ifrn.edu.diatinf.tads.poo.java.exceptions.AnimalJaAdotado;
import ifrn.edu.diatinf.tads.poo.java.exceptions.AnimalJaCastrado;
import ifrn.edu.diatinf.tads.poo.java.exceptions.AnimalNaoEncontrado;
import ifrn.edu.diatinf.tads.poo.java.exceptions.VoluntarioJaCadastrado;
import ifrn.edu.diatinf.tads.poo.java.exceptions.VoluntarioNaoEncontrado;


	public class ResgateAmigo {

	private Animal[] animais;
	private int qtdAnimais;
	private Voluntarios[] voluntarios;
	private int qtdVoluntarios;
	private Doacoes[] doacoes;
	private int qtdDoacoes;
	
	Scanner sc = new Scanner(System.in);
	
	
	private void duplicarCapacidadeAnimal() {
		Animal novoAnimal[] = new Animal[animais.length * 2];
		System.arraycopy(animais, 0, novoAnimal, 0, qtdAnimais);
		animais = novoAnimal;
	}
	
	private void duplicarCapacidadeVoluntarios() {
		Voluntarios novoVoluntarios[] = new Voluntarios[voluntarios.length * 2];
		System.arraycopy(voluntarios, 0, novoVoluntarios, 0, qtdVoluntarios);
		voluntarios = novoVoluntarios;
	}
	
	private void duplicarCapacidadeDoacoes() {
		Doacoes novaDoacao[] = new Doacoes[doacoes.length * 2];
		System.arraycopy(doacoes, 0, novaDoacao, 0, qtdDoacoes);
		doacoes = novaDoacao;
	}
	
	public ResgateAmigo() {
		
		animais = new Animal[2];
		qtdAnimais = 0;
		
		voluntarios = new Voluntarios[2];
		qtdVoluntarios = 0;
		
		doacoes = new Doacoes[2];
		qtdDoacoes = 0;
		
	}
	
	// CLASSE ANIMAL
	public void CadastrarAnimal(Animal a) {
		if (qtdAnimais == animais.length) 
			duplicarCapacidadeAnimal();
		
			animais[qtdAnimais] = a;
			qtdAnimais++;
		
	}
	
	public void CastrarAnimal(int numero) throws AnimalJaCastrado {
		Animal a = null;
		int castrado = 1;
		for (int i = 0; i < qtdAnimais; i++) {
			if (i == numero) {
				a = animais[i];
				if (a.getCastrado() == 1) {
					throw new AnimalJaCastrado();
				}
				if (a.getCastrado() == 2) {
					a.setCastrado(castrado);
					System.out.println("Animal " + a.getNome() + " foi castrado com sucesso");
				}
			}
		}
	}
		
	public void AdotarAnimal(int numero) throws AnimalJaAdotado, AnimalNaoEncontrado {
		Animal a = null;
		String situacao = "Adotado";
		
		for (int i = 0; i < qtdAnimais; i++) {
			if (animais[i].getSituacao().equals(situacao)) {
				throw new AnimalJaAdotado();
			}
			if (animais[i].getSituacao().equals("1")) {
				if(i == numero) {
					a = animais[i];
					System.out.println(a.getSituacao());
					a.setSituacao(situacao);
					a.setDataAdocao(new Date());
					System.out.println("Parabéns, "+ a.getNome() + " foi " + a.getSituacao());
				}
			}
		}
		if(a == null) {
			throw new AnimalNaoEncontrado();
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
	public void CadastrarVoluntario(Voluntarios v) throws VoluntarioJaCadastrado {
		if (qtdVoluntarios == voluntarios.length) 
			duplicarCapacidadeVoluntarios();
		
		for (int i = 0; i < qtdVoluntarios; i++) {
			if (voluntarios[i].getCpf().equals(v.getCpf())) {
				throw new VoluntarioJaCadastrado();
			}
		}
			voluntarios[qtdVoluntarios] = v;
			qtdVoluntarios++;
	}
	
	public void AlterarSituacaoVoluntario(String cpf) throws VoluntarioNaoEncontrado {
		Voluntarios v = null;
		for (int i = 0; i < qtdVoluntarios; i++) {
			
			if (voluntarios[i].getCpf().equals(cpf)) {
				v = voluntarios[i];
				System.out.println("Voluntário: " + v.getNome() + "\nSituação: " + v.getSituacao());
				System.out.println("Atualizar Situação:\n1 - Ativo\n2 - Pausado\n3 - Desativo");
				int situacao = sc.nextInt();
				
				if (situacao == 1) {
					v.setSituacao(situacao);
					System.out.println("Situação atualizada com sucesso");
				}
				
				else if (situacao == 2 || situacao == 3) {
					Scanner scLine = new Scanner(System.in);
					System.out.println("Digite o motivo");
					String motivo = scLine.nextLine();
					
					v.setMotivo(motivo);
					v.setSituacao(situacao);
					System.out.println("Situação atualizada com sucesso");
				}
				
				else {
					System.out.println("Situação Inválida");
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
				System.out.println(i + " - " + v.getNome() + " CPF: " + v.getCpf());
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
		if (qtdDoacoes == doacoes.length) 
			duplicarCapacidadeDoacoes();
			
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
				sb.append("Tipo da Doação: "+ d.getTipoDoacao());
				sb.append("\n");
				sb.append("Doação: " + d.getDoacao());
				sb.append("\n");
				sb.append("Quantidade: " + d.getQtdDoacao());
				sb.append("\n");
				sb.append("Data da Doação: " + d.getDataDoacao());
				sb.append("\n");
			}
			return sb.toString();
		}
	}
}
