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
		System.out.println("|5| - Verificar animais disponíveis para adoção");
		System.out.println("|6| - Verificar animais em tratamento");
		System.out.println("|7| - Cadastrar vacina no animal");
		System.out.println("|8| - Castrar um animal");
		System.out.println("|9| - Cadastrar um voluntário");
		System.out.println("|10| - Alterar situação de um voluntário");
		System.out.println("|11| - Verificar voluntários ativos");
		System.out.println("|12| - Verificar voluntários com participação pausada");
		System.out.println("|13| - Verificar voluntários desativos");
		System.out.println("|14| - Cadastrar doação");
		System.out.println("|15| - Ver doações");
		System.out.println("|0| - Sair");
		System.out.print("\nDigite a opção escolhida:\n ");
		
	}

	public static void main(String[] args) {
		
		ResgateAmigo resgateAmigo = new ResgateAmigo();
		
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		
		do {
			
			Menu();
			opcao = sc.nextInt();
			
			//CADASTRAR ANIMAL
			if (opcao == 1) {
			
				Animal animal = new Animal();
				
				System.out.println("Digite o nome do animal:\n");
				String nome = sc.next();
				
				System.out.println("Qual o tipo do animal? Digite a opção correspondente:\n 1 - Gato || 2 - Cachorro \n");
				String tipo = sc.next();
				
				System.out.println("Qual a raça do animal?\n");
				String raca = sc.next();
				

				sc = new Scanner(System.in);
				System.out.println("Digite o número correspondente para a situação do animal:\n 1 - Para adoção ou 2 - Em tratamento\n");
				String situacao = sc.next();
				
				System.out.println("O animal já tomou alguma vacina?\n 1 - Sim || 2 - Não\n");
				String vacinas = sc.next();
				
				System.out.println("O animal é castrado?\n 1 - Sim || 2 - Não\n");
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
				System.out.println("ANIMAL CADASTRADO COM SUCESSO.");
				
			}
			
			//ADOTAR ANIMAL
			if (opcao == 2) {
				
				if(resgateAmigo.ListarAnimaisDisponiveis()) {
					System.out.println("Selecione o número do animal você deseja adotar:");
					int numero = sc.nextInt();
					resgateAmigo.AdotarAnimal(numero);
				}
				else {
					System.out.println("Não existe animais disponíveis para adoção");
				}

			}
			
			//VER QUANTIDADE TOTAL DE ANIMAIS
			if (opcao == 3) {
				
				System.out.println("Até o momento foi/foram cadastrado(s) " + resgateAmigo.QtdAnimais() + " animal(is) no sistema.");	
			}
			
			//VER ANIMAIS QUE JÁ FORAM ADOTADOS
			if (opcao == 4) {
				
				if(resgateAmigo.ListarAnimaisAdotados() == true) {
				}
				else {
					System.out.println("Nenhum animal adotado por enquanto.");
				}
			}
				
			//VERIFICAR ANIMAIS DISPONÍVEIS PARA ADOÇÃO
			if (opcao == 5) {
				
				if(resgateAmigo.ListarAnimaisDisponiveis() == true) {
				}
			
			else {
				System.out.println("Nenhum animal disponível para adoção no momento.");
			}
				}
			
			//VERIFICAR ANIMAIS EM TRATAMENTO
			if (opcao == 6) { 
				
				if(resgateAmigo.ListarAnimaisEmTratamento() == true) {
			}
			else {
				System.out.println("Nenhum animal em tratamento no momento.");
			}
				}
			
			//CADASTRAR VACINA NO ANIMAL
			if (opcao == 7) {
				
			}
			
			//ALTERAR SITUAÇÃO DE CASTRAÇÃO DO ANIMAL
			if (opcao == 8) {
				
			}
			
			//CADASTRAR UM VOLUNTÁRIO
			if (opcao == 9) {
				
				Voluntarios voluntarios = new Voluntarios();
				
				System.out.println("Digite o nome do voluntário:\n");
				String nome = sc.next();
				
				System.out.println("CPF do voluntário:");
				String cpf = sc.next();
				
				System.out.println("Telefone:");
				int telefone = sc.nextInt();
				
				System.out.println("Data de nascimento:");
				String dataNascimento = sc.next();
				
				System.out.println("Sexo:");
				String sexo = sc.next();
				
				System.out.println("Disponibilidade:\n 1 - Manhã || 2 - Tarde || 3 - Noite");
				int disponibilidade = sc.nextInt();
				
				System.out.println("Função:\n 1 - Veterinário || 2 - Motorista || 3 - Limpeza do local || 4 - Limpeza dos animais || 5 - Outro");
				int funcao = sc.nextInt();
				
				System.out.println("Situação:\n 1 - Ativo || 2 - Pausado || 3 - Desativo");
				int situacao = sc.nextInt();
				
				voluntarios.setNome(nome);
				voluntarios.setIdVoluntario(cpf);
				voluntarios.setTelefone(telefone);
				voluntarios.setDataNascimento(dataNascimento);
				voluntarios.setSexo(sexo);
				voluntarios.setDisponibilidade(disponibilidade);
				voluntarios.setFuncao(funcao);
				voluntarios.setSituacao(situacao);
				
				resgateAmigo.CadastrarVoluntario(voluntarios);
				System.out.println("VOLUNTÁRIO CADASTRADO COM SUCESSO.");
				
			}
			
			//ALTERAR SITUAÇÃO DE UM VOLUNTÁRIO
			if (opcao == 10) {
				
				
			}
			
			//VERIFICAR VOLUNTÁRIOS ATIVOS
			if (opcao == 11) {
				
				if(resgateAmigo.ListarVoluntariosAtivos() == true) {
			}
			else {
				System.out.println("Nenhum voluntário ativo no momento.");
				}
			}
			
			//VERIFICAR VOLUNTÁRIOS COM PARTICIPAÇÃO PAUSADA
			if (opcao == 12) {
				
				if(resgateAmigo.ListarVoluntariosPausados() == true) {
			}
			else {
				System.out.println("Nenhum voluntário com participação pausada no momento.");
				}
			}	
			
			//VERIFICAR VOLUNTARIOS COM SITUAÇÃO CANCELADA
			if (opcao == 13) {
				
				if(resgateAmigo.ListarVoluntariosDesativos() == true) {
			}
			else {
				System.out.println("Nenhum voluntário com participação cancelada no momento.");
				}
			}
			
			//CADASTRAR DOAÇÃO
			if (opcao == 14) {
				
				Doacoes doacoes = new Doacoes();
				
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
				
				System.out.println("Tipo de doação: 1 - Dinheiro / 2 - Material de limpeza / 3 - Itens para os animais / 4 - Itens para a ONG"
						+ "5 - Ração para gato / 6 - Remédio / 7 - Vacina / 8 - Outro");
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
				System.out.println("DOAÇÃO CADASTRADA COM SUCESSO.");
			}
			
			//VER DOACOES
			if (opcao == 15) {
				
			}
		}
			
			while (opcao != 0); {
				
				System.exit(0);
				sc.close();
				
			}
		
	}
		
}
