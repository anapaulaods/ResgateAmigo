package ifrn.edu.diatinf.tads.poo.java.modelo;
import ifrn.edu.diatinf.tads.poo.java.modelo.*;

import java.util.Scanner;

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
	
	public void AdotarAnimal(int numero) {
		Animal a = null;
		String situacao = "adotado(a)";
		
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
				if (animais[i].getSituacao().equals("adotado(a)")) {
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
				System.out.println("Nenhum animal disponível para adoção no momento");
			}
		}
		return true;
	}
	
	public boolean ListarAnimaisEmTratamento() {
		
		if(qtdAnimais == 0) {
			return false;	
		}
		else {
			Animal a = null;
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
		return true;
	}
	
	//VOLUNTÁRIOS
	
	public void CadastrarVoluntario(Voluntarios v) {
		voluntarios[qtdVoluntarios] = v;
		qtdVoluntarios++;
	}
	
	public void AlterarSituacaoVoluntario(int id) {
		
		Scanner sc = new Scanner(System.in); 
		Voluntarios v = null;
		for (int i = 0; i < qtdVoluntarios; i++) {
			if (i == id) {
				v = voluntarios[i];
				System.out.println("Voluntário: " + v.getNome() + "\nSituação: " + v.getSituacao());
				System.out.println("Atualizar situação:\n1 - Ativo\n2 - Pausado\n3 - Desativo");
				int situacao = sc.nextInt();
				if (situacao > 3) {
					System.out.println("Situação inválida");
				}
				else {
					v.getSituacao();
					System.out.println("Situação atualizada com sucesso");
					
					sc.close();
				}
			}
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
	
	//DOAÇÕES
	
	public void CadastrarDoacoes(Doacoes d) {
		doacoes[qtdDoacoes] = d;
		qtdDoacoes++;
	}
	
	public void ListarDoacoes() {
		
	}

}
