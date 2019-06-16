package ifrn.edu.diatinf.tads.poo.java.view;
import ifrn.edu.diatinf.tads.poo.java.modelo.*;

import java.util.Scanner;

public class Main {
	
public static void Menu() {
	System.out.println("\n----- Menu do Sistema ----- ");
	System.out.println("\n|1| - Cadastrar animal");
	System.out.println("|2| - Adotar animal");
	System.out.println("|3| - Ver quantidade total de animais");
	System.out.println("|4| - Verificar animais que foram adotados");
	System.out.println("|5| - Verificar animais disponíveis para adoção");
	System.out.println("|6| - Verificar animais em tratamento");
	System.out.println("|7| - Cadastrar vacina no animal");
	System.out.println("|8| - Castrar animal");
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

public static void MenuDoacao() {
	System.out.println("\n------Menu Doação ------");
	System.out.println("\n|1| - R$ 2,00");
	System.out.println("\n|2| - R$ 5,00");
	System.out.println("\n|3| - R$ 10,00");
	System.out.println("\n|4| - R$ 20,00");
	System.out.println("\n|5| - R$ 50,00");
	System.out.println("\n|6| - Outro valor");
}

	public static void main(String[] args) {
		
		Animal a = new Animal();
		Voluntarios v = new Voluntarios();
		Doacoes d = new Doacoes();
		ResgateAmigo resgateAmigo = new ResgateAmigo();
		
		a.setNome("Lulu");
		a.setTipo("cachorro");
		a.setRaca("vira-lata");
		a.setSituacao("1");
		a.setVacina(2);
		a.setCastrado(2);
		a.setDataChegada("05/06/2019");
		
		resgateAmigo.CadastrarAnimal(a);
		
		v.setNome("Plácido");
		v.setTelefone(998673234);
		v.setDataNascimento("10/03/1987");
		v.setSexo("Masculino");
		v.setDisponibilidade(2);
		v.setFuncao(2);
		v.setSituacao(1);
		
		resgateAmigo.CadastrarVoluntario(v);
		
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		
		do {
			
			Menu();
			opcao = sc.nextInt();
			
			// CADASTRAR ANIMAL NO SISTEMA
			if (opcao == 1) { 
				Animal animal = new Animal();
				System.out.println("Digite o nome do animal:\n");
				String nome = sc.next();
				
				System.out.println("O animal é gato ou cachorro?\n");
				String tipo = sc.next();
				
				System.out.println("Qual a raça do animal?\n");
				String raca = sc.next();
				
				System.out.println("Digite o número correspondente a situação do animal:\n1 - Para adoção\n2 - Em tratamento");
				String situacao = sc.next();
				
				System.out.println("O animal já tomou alguma vacina?\n1 - Sim\n2 - Não");
				int vacina = sc.nextInt();
				
				System.out.println("O animal é castrado?\n1 - Sim\n2 - Não");
				int castrado = sc.nextInt();
				
				System.out.println("Qual foi a data de chegada do animal na ONG?\n");
				String dataChegada = sc.next();
				
				animal.setNome(nome);
				animal.setTipo(tipo);
				animal.setRaca(raca);
				animal.setVacina(vacina);
				animal.setSituacao(situacao);
				animal.setCastrado(castrado);
				animal.setDataChegada(dataChegada);
				
				resgateAmigo.CadastrarAnimal(animal);
				System.out.println("O animal foi cadastrado com sucesso!");
				
			}
			
			// ADOTAR ANIMAL
			if (opcao == 2) { 
				if(resgateAmigo.ListarAnimaisDisponiveis()) {
					System.out.println("Selecione o número do animal você deseja adotar:");
					int numero = sc.nextInt();
					resgateAmigo.AdotarAnimal(numero);
				}
				else {
					System.out.println("Não existe animais disponíveis para Adoção");
				}

			}
			
			// VER QUANTIDADE TOTAL DE ANIMAIS
			if (opcao == 3) {
				
				System.out.println("Até o momento foram cadastrados " + resgateAmigo.QtdAnimais() + " animais no sistema.");	
			}
			
			// VERIFICAR ANIMAIS QUE FORAM ADOTADOS
			if (opcao == 4) {
				if(resgateAmigo.ListarAnimaisAdotados() == true) {
					
				}
				else {
					System.out.println("Nenhum Animal foi adotado no momento");
				}
			}
			
			// VERIFICAR ANIMAIS DISPONÍVEIS PARA ADOÇÃO
			if (opcao == 5) {
				if(resgateAmigo.ListarAnimaisDisponiveis() == true) {
					
				}
				else {
					System.out.println("Nenhum Animal disponível para adoção");
				}
			}
			
			// VERIFICAR ANIMAIS EM TRATAMENTO
			if (opcao == 6) {
				if (resgateAmigo.ListarAnimaisTratamento() == true) {
					
				}
				else {
					System.out.println("Nenhum Animal em tratamento");
				}
			}
			
			// CADASTRAR VACINA NO ANIMAL
			if (opcao == 7) {
				if (resgateAmigo.ListarAnimaisParaVacina() == true) {
					System.out.println("Digite o número do animal para vacinar");
					int numero = sc.nextInt();
					resgateAmigo.VacinarAnimal(numero);
				}
				else {
					System.out.println("Não existe animais disponíveis para vacinar");
				}
			}
			
			// CASTRAR ANIMAL
			if (opcao == 8) {
				if (resgateAmigo.ListarAnimaisParaCastrar() == true) {
					System.out.println("Digite o numero do animal para castrar");
					int numero = sc.nextInt();
					resgateAmigo.CastrarAnimal(numero);
				}
				else {
					System.out.println("Não existe animais disponíveis para castrar");
				}
			}
			
			// CADASTRAR UM VOLUNTÁRIO
			if (opcao == 9) {
				Voluntarios voluntarios = new Voluntarios();
				System.out.println("Digite o nome do voluntário:\n");
				String nome = sc.next();
				
				System.out.println("Telefone:");
				int telefone = sc.nextInt();
				
				System.out.println("Data de nascimento:");
				String dataNascimento = sc.next();
				
				System.out.println("Sexo:");
				String sexo = sc.next();
				
				System.out.println("Disponibilidade:\n1 - Manhã\n2 - Tarde\n3 - Noite");
				int disponibilidade = sc.nextInt();
				
				System.out.println("Função:\n1 - Veterinário\n2 - Motorista\n3 - Limpeza do local\n4 - Limpeza dos animais\n5 - Outro");
				int funcao = sc.nextInt();
				
				System.out.println("Situação:\n1 - Ativo\n2 - Pausado\n3 - Desativo");
				int situacao = sc.nextInt();
				
				voluntarios.setNome(nome);
				voluntarios.setTelefone(telefone);
				voluntarios.setDataNascimento(dataNascimento);
				voluntarios.setSexo(sexo);
				voluntarios.setDisponibilidade(disponibilidade);
				voluntarios.setFuncao(funcao);
				voluntarios.setSituacao(situacao);
				
				resgateAmigo.CadastrarVoluntario(voluntarios);
				System.out.println("Voluntário cadastrado com sucesso!");
				
			}
			
			// ALTERAR SITUAÇÃO DE UM VOLUNTÁRIO
			if (opcao == 10) {
				if (resgateAmigo.ListarTodosVoluntarios() == true) {
					System.out.println("Digite o id do Voluntario");
					int id = sc.nextInt();
					resgateAmigo.AlterarSituacaoVoluntario(id);
				}
				else {
					System.out.println("Não existe Voluntário no Sistema");
				}
			}
			
			// VERIFICAR VOLUNTÁRIOS ATIVOS
			if (opcao == 11) {
				if (resgateAmigo.ListarVoluntariosAtivos() == true) {
					
				}
				else {
					System.out.println("Nenhum Voluntário Ativo no momento");
				}
			}
			
			// VERIFICAR VOLUNTÁRIOS COM PARTICIPAÇÃO PAUSADA
			if (opcao == 12) {
				if (resgateAmigo.ListarVoluntariosPausados() == true) {
					
				}
				else {
					System.out.println("Nenhum Voluntário Pausado no momento");
				}
			}
			
			// VERIFICAR VOLUNTÁRIOS DESATIVOS
			if (opcao == 13) {
				if (resgateAmigo.ListarVoluntariosDesativos() == true) {
					
				}
				else {
					System.out.println("Nenhum Voluntário Desativo no momento");
				}
			}
			
			// CADASTRAR DOAÇÃO
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
				
				System.out.println("Tipo de doação:\n1 - Dinheiro\n2 - Material de limpeza\n3 - Itens para os animais\n4 - Itens para a ONG"
						+ "\n5 - Ração para gato\n6 - Ração para cachorro\n7 - Remédio\n8 - Vacina\n");
				
				int tipoDoacao = sc.nextInt();
				
				switch (tipoDoacao) {
				case 1: // dinheiro
					MenuDoacao();
					int op = sc.nextInt();
					
					if (op == 1) {
						doacoes.setDoacao("R$ 2,00");
					}
					
					if (op == 2) {
						doacoes.setDoacao("R$ 5,00");
					}
					
					if (op == 3) {
						doacoes.setDoacao("R$ 10,00");
					}
					
					if (op == 4) {
						doacoes.setDoacao("R$ 20,00");
					}
					
					if (op == 5) {
						doacoes.setDoacao("R$ 50,00");
					}
					
					if (op == 6) {
						System.out.println("Digite o valor: ");
						String valor = sc.next();
						doacoes.setDoacao(valor);
					}
					
					doacoes.setTipoDoacao("Dinheiro");

					break;
				case 2: // Material de limpeza
					System.out.println("Material de Limpeza:");
					System.out.println("Digite qual material de limpeza você irá doar");
					String material = sc.next();
					System.out.println("Digite a quantidade");
					int qtdMaterial = sc.nextInt();
					
					doacoes.setTipoDoacao("Material de Limpeza");
					doacoes.setDoacao(material);
					doacoes.setQtdDoacao(qtdMaterial);
					break;
				case 3: // Itens para animais
					System.out.println("Intens para animais:");
					System.out.println("Digite qual item você deseja doar");
					String itemA = sc.next();
					System.out.println("Digite a quantidade");
					int qtdItemA = sc.nextInt();
					
					doacoes.setTipoDoacao("Itens para Animais");
					doacoes.setQtdDoacao(qtdItemA);
					doacoes.setDoacao(itemA);
					break;
				case 4: // itens para a ONG
					System.out.println("Intens para a ONG");
					System.out.println("Digite qual item você doar");
					String itemOng = sc.next();
					System.out.println("Digite a quantidade:");
					int qtdItemOng = sc.nextInt();
					
					doacoes.setTipoDoacao("Itens para a ONG");
					doacoes.setQtdDoacao(qtdItemOng);
					doacoes.setDoacao(itemOng);
					break;
				case 5: // Ração para gato
					System.out.println("Ração para gato");
					System.out.println("Digite a quantidade da ração");
					int qtdRacaoG = sc.nextInt();
					
					doacoes.setTipoDoacao("Ração para Gato");
					doacoes.setQtdDoacao(qtdRacaoG);
					doacoes.setDoacao("Ração para Gato");
					break;
				case 6: // Ração para cachorro
					System.out.println("Ração para cachorro");
					System.out.println("Digite a quantidade da ração");
					int qtdRacaoC = sc.nextInt();
					
					doacoes.setTipoDoacao("Ração para Cachorro");
					doacoes.setQtdDoacao(qtdRacaoC);
					doacoes.setDoacao("Ração para Cachorro");
					break;
				case 7: // Remédio
					System.out.println("Remédio");
					System.out.println("Digite o remédio irá doar");
					String remedio = sc.next();
					System.out.println("Digite a quantidade");
					int qtdRemedio = sc.nextInt();
					
					doacoes.setTipoDoacao("Remédio");
					doacoes.setQtdDoacao(qtdRemedio);
					doacoes.setDoacao(remedio);
					break;
				case 8: // Vacina
					System.out.println("Vacina");
					System.out.println("Digite a vacina que irá doar");
					String vacina = sc.next();
					System.out.println("Digite a quantidade");
					int qtdVacina = sc.nextInt();
					
					doacoes.setTipoDoacao("Vacina");
					doacoes.setQtdDoacao(qtdVacina);
					doacoes.setDoacao(vacina);
					
				default:
					break;
				}
				
				System.out.println("Data:");
				String dataDoacao = sc.next();
				
				doacoes.setNomeDoador(nomeDoador);
				doacoes.setCpfDoador(cpfDoador);
				doacoes.setDataNascDoador(dataNascDoador);
				doacoes.setTelefoneDoador(telefoneDoador);
				doacoes.setEmailDoador(emailDoador);
				doacoes.setDataDoacao(dataDoacao);
				
				resgateAmigo.CadastrarDoacoes(doacoes);
				System.out.println("Doação cadastrada com sucesso!");
			}
			
			// VER DOAÇÕES
			if (opcao == 15) {
				System.out.println(resgateAmigo.ListarDoacoes());
			}
		}
		
		while (opcao != 0); {
			System.exit(0);
			sc.close();
		}
	}	
}
