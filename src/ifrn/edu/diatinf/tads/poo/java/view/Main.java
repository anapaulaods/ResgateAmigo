package ifrn.edu.diatinf.tads.poo.java.view;
import ifrn.edu.diatinf.tads.poo.java.modelo.*;
import java.util.Scanner;

public class Main {
	
public static void Menu() {
		
		System.out.println("\n\n----- Menu do Sistema ----- ");
		System.out.println("\n|1| - Cadastrar animal");
		System.out.println("|2| - Adotar animal");
		System.out.println("|3| - Ver quantidade total de animais");
		System.out.println("|4| - Verificar animais que foram adotados");
		System.out.println("|5| - Verificar animais dispon�veis para ado��o");
		System.out.println("|6| - Verificar animais em tratamento");
		System.out.println("|7| - Cadastrar vacina no animal");
		System.out.println("|8| - Alterar situa��o de castra��o do animal");
		System.out.println("|9| - Cadastrar um volunt�rio");
		System.out.println("|10| - Alterar situa��o de um volunt�rio");
		System.out.println("|11| - Verificar volunt�rios ativos");
		System.out.println("|12| - Verificar volunt�rios com participa��o pausada");
		System.out.println("|13| - Verificar colunt�rios desativos");
		System.out.println("|14| - Cadastrar doa��o");
		System.out.println("|15| - Ver doa��es");
		System.out.println("|0| - Sair");
		System.out.print("\nDigite a op��o escolhida:\n ");
		
	}

	public static void main(String[] args) {
		
		//Animal animal = new Animal();
		Voluntarios voluntarios = new Voluntarios();
		Doacoes doacoes = new Doacoes();
		ResgateAmigo resgateAmigo = new ResgateAmigo();
		
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		
		do {
			
			Menu();
			opcao = sc.nextInt();
			

			if (opcao == 1) { //Cadastrar animal
				Animal animal = new Animal();
				System.out.println("Digite o nome do animal:\n");
				String nome = sc.next();
				
				System.out.println("O animal � gato ou cachorro?\n");
				String tipo = sc.next();
				
				System.out.println("Qual a ra�a do animal?\n");
				String raca = sc.next();
				
				System.out.println("Digite o n�mero correspondente a situa��o do animal:\n 1 - Para ado��o ou 2 - Em tratamento\n");
				String situacao = sc.next();
				
				System.out.println("O animal j� tomou alguma vacina? Qual(is)?\n");
				String vacinas = sc.next();
				
				System.out.println("O animal � castrado?\n");
				String castrado = sc.next();
				
				System.out.println("Qual foi a data de chegada do animal na ONG?\n");
				String dataChegada = sc.next();
				
				animal.setNome(nome);
				animal.setTipo(tipo);
				animal.setRaca(raca);
				animal.setSituacao(situacao);
				animal.setVacinas(vacinas);
				animal.setCastrado(castrado);
				animal.setDataChegada(dataChegada);
				
				resgateAmigo.CadastrarAnimal(animal);
				System.out.println("O animal foi cadastrado com sucesso!");
				
			}
			
			if (opcao == 2) { //Adotar Animal
				resgateAmigo.ListarAnimaisDisponiveis();
				System.out.println("Digite qual animal voc� deseja adotar:");
				String nome = sc.next();
				resgateAmigo.AdotarAnimal(nome);
			}
			
			if (opcao == 3) { //Ver quantidade total de animais
				
				System.out.println("At� o momento foram cadastrados " + resgateAmigo.QtdAnimais() + " animais no sistema.");	
			}
			
			if (opcao == 4) {
				
			}
			
			if (opcao == 5) { //Verificar animais dispon�veis para ado��o
				resgateAmigo.ListarAnimaisDisponiveis();
			}
			
			if (opcao == 6) {
				
			}
			
			if (opcao == 7) {
				
			}
			
			if (opcao == 8) {
				
			}
			
			if (opcao == 9) { //Cadastrar um volunt�rio
				
				System.out.println("Digite o nome do volunt�rio:\n");
				String nome = sc.next();
				
				System.out.println("Telefone:");
				int telefone = sc.nextInt();
				
				System.out.println("Data de nascimento:");
				String dataNascimento = sc.next();
				
				System.out.println("Sexo:");
				String sexo = sc.next();
				
				System.out.println("Disponibilidade: 1 - Manh� / 2 - Tarde / 3 - Noite");
				int disponibilidade = sc.nextInt();
				
				System.out.println("Fun��o: 1 - Veterin�rio / 2 - Motorista / 3 - Limpeza do local / 4 - Limpeza dos animais / 5 - Outro");
				int funcao = sc.nextInt();
				
				System.out.println("Situa��o: 1 - Ativo / 2 - Pausado / 3 - Desativo");
				int situacao = sc.nextInt();
				
				voluntarios.setNome(nome);
				voluntarios.setTelefone(telefone);
				voluntarios.setDataNascimento(dataNascimento);
				voluntarios.setSexo(sexo);
				voluntarios.setDisponibilidade(disponibilidade);
				voluntarios.setFuncao(funcao);
				voluntarios.setSituacao(situacao);
				
				resgateAmigo.CadastrarVoluntario(voluntarios);
				System.out.println("Volunt�rio cadastrado com sucesso!");
				
			}
			
			if (opcao == 10) {
				
			}
			
			if (opcao == 11) {
				
			}
			
			if (opcao == 12) {
				
			}
			
			if (opcao == 13) {
				
			}
			
			if (opcao == 14) { //Cadastrar doa��o
				
				System.out.println("Doador:");
				String nomeDoador = sc.next();
				
				System.out.println("CPF:");
				String cpfDoador = sc.next();
				
				System.out.println("Data Nascimento:");
				String dataNascDoador = sc.next();
				
				System.out.println("Telefone:");
				String telefoneDoador = sc.next();
				
				System.out.println("Email:");
				String emailDoador = sc.next();
				
				System.out.println("Tipo de doa��o: 1 - Dinheiro / 2 - Material de limpeza / 3 - Itens para os animais / 4 - Itens para a ONG"
						+ "5 - Ra��o para gato / 6 - Rem�dio / 7 - Vacina / 8 - Outro");
				int tipoDoacao = sc.nextInt();
				
				System.out.println("Quantidade:");
				int qtdDoacao = sc.nextInt();
				
				System.out.println("Data:");
				String dataDoacao = sc.next();
				
				doacoes.setNomeDoador(nomeDoador);
				doacoes.setCpfDoador(cpfDoador);
				doacoes.setDataNascDoador(dataNascDoador);
				doacoes.setTelefoneDoador(telefoneDoador);
				doacoes.setEmailDoador(emailDoador);
				doacoes.setTipoDoacao(tipoDoacao);
				doacoes.setQtdDoacao(qtdDoacao);
				doacoes.setDataDoacao(dataDoacao);
				
				resgateAmigo.CadastrarDoacoes(doacoes);
				System.out.println("Doa��o cadastrada com sucesso!");
			}
			
			if (opcao == 15) {
				
			}
		}
			
			while (opcao != 0); {
				
				System.exit(0);
				sc.close();
				
			}
		
	}
		
}
