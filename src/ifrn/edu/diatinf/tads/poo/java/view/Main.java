package ifrn.edu.diatinf.tads.poo.java.view;
import ifrn.edu.diatinf.tads.poo.java.exceptions.AnimalJaAdotado;
import ifrn.edu.diatinf.tads.poo.java.exceptions.VoluntarioJaCadastrado;
import ifrn.edu.diatinf.tads.poo.java.modelo.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
	System.out.println("|7| - Castrar animal");
	System.out.println("|8| - Cadastrar um voluntário");
	System.out.println("|9| - Alterar situação de um voluntário");
	System.out.println("|10| - Verificar voluntários ativos");
	System.out.println("|11| - Verificar voluntários com participação pausada");
	System.out.println("|12| - Verificar voluntários desativos");
	System.out.println("|13| - Cadastrar doação");
	System.out.println("|14| - Ver doações");
	System.out.println("|0| - Sair");
	System.out.print("\nDigite a opção escolhida:\n ");
}

public static void MenuDoacao() {
	System.out.println("\n------Menu doação ------");
	System.out.println("\n|1| - R$ 2,00");
	System.out.println("\n|2| - R$ 5,00");
	System.out.println("\n|3| - R$ 10,00");
	System.out.println("\n|4| - R$ 20,00");
	System.out.println("\n|5| - R$ 50,00");
	System.out.println("\n|6| - Outro valor");
}

	public static void main(String[] args) throws AnimalJaAdotado, VoluntarioJaCadastrado {
		
		Animal a = new Animal();
		Voluntarios v = new Voluntarios();
		Doacoes d = new Doacoes();
		ResgateAmigo resgateAmigo = new ResgateAmigo();
		
		// ANIMAL
		a.setNome("Lulu");
		a.setTipo("cachorro");
		a.setRaca("vira-lata");
		a.setSituacao("1");
		a.setCastrado(2);
		
		DateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		Date datachegada;
		try {
			datachegada = f.parse("18/06/2019");
			a.setDataChegada(datachegada);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		resgateAmigo.CadastrarAnimal(a);
		
		// VOLUNTÁRIO
		v.setNome("Plácido");
		v.setCpf("111");
		v.setTelefone("900000000");
	    
		DateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");
		Date datanasc;
		try {
			datanasc = f1.parse("10/08/1997");
			v.setDataNascimento(datanasc);
		} catch (ParseException e1) {
			
			e1.printStackTrace();
		}
		
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
				Scanner scLine = new Scanner(System.in);
				
				System.out.println("Digite o nome do animal:\n");
				String nome = scLine.nextLine();
				
				System.out.println("O animal é gato ou cachorro?\n");
				String tipo = scLine.nextLine();
				
				System.out.println("Qual a raça do animal?\n");
				String raca = scLine.nextLine();
				
				System.out.println("Digite o número correspondente a situação do animal:\n1 - Para adoção\n2 - Em tratamento");
				String situacao = sc.next();
				
				System.out.println("O animal é castrado?\n1 - Sim\n2 - Não");
				int castrado = sc.nextInt();
				
				try {
					System.out.println("Qual foi a data de chegada do animal na ONG?\n");
					String dataChegada = scLine.nextLine();
					DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
					Date dt = df.parse(dataChegada);
					animal.setDataChegada(dt);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
				animal.setNome(nome);
				animal.setTipo(tipo);
				animal.setRaca(raca);
				animal.setSituacao(situacao);
				animal.setCastrado(castrado);
				
				resgateAmigo.CadastrarAnimal(animal);
				System.out.println("O animal foi cadastrado com sucesso!");
				
			}
			
			// ADOTAR ANIMAL
			if (opcao == 2) {
				
				try {
					if(resgateAmigo.ListarAnimaisDisponiveis()) {
						System.out.println("Selecione o número do animal você deseja adotar:");
						int numero = sc.nextInt();
						resgateAmigo.AdotarAnimal(numero);
					}
					else {
						System.out.println("Não existe animais disponíveis para adoção");
					}
				} catch (Exception e) {
					// TODO: handle exception
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
					System.out.println("Nenhum animal foi adotado no momento.");
				}
			}
			
			// VERIFICAR ANIMAIS DISPONÍVEIS PARA ADOÇÃO
			if (opcao == 5) {
				if(resgateAmigo.ListarAnimaisDisponiveis() == true) {
					
				}
				else {
					System.out.println("Nenhum animal disponível para adoção.");
				}
			}
			
			// VERIFICAR ANIMAIS EM TRATAMENTO
			if (opcao == 6) {
				if (resgateAmigo.ListarAnimaisTratamento() == true) {
					
				}
				else {
					System.out.println("Nenhum animal em tratamento.");
				}
			}
			
			// CASTRAR ANIMAL
			if (opcao == 7) {
				
				try {
					if (resgateAmigo.ListarAnimaisParaCastrar() == true) {
						System.out.println("Digite o numero do animal para castrar:");
						int numero = sc.nextInt();
						resgateAmigo.CastrarAnimal(numero);
					}
					else {
						System.out.println("Não existe animais disponíveis para castrar.");
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
			
			// CADASTRAR UM VOLUNTÁRIO
			if (opcao == 8) {
				Voluntarios voluntarios = new Voluntarios();
				Scanner scLine = new Scanner(System.in);
				
				System.out.println("Digite o nome do voluntário:\n");
				String nome = scLine.nextLine();
				
				System.out.println("Digite o CPF do voluntário");
				String cpf = scLine.nextLine();
				
				System.out.println("");
				
				System.out.println("Telefone:");
				String telefone = scLine.nextLine();
				
				try {
					System.out.println("Data de nascimento: ");
					String data = scLine.nextLine();
					DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
					Date dt = df.parse(data);
					System.out.println(dt);
					voluntarios.setDataNascimento(dt);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
								
				System.out.println("Sexo:");
				String sexo = sc.next();
				
				System.out.println("Disponibilidade:\n1 - Manhã\n2 - Tarde\n3 - Noite");
				int disponibilidade = sc.nextInt();
				
				System.out.println("Função:\n1 - Veterinário\n2 - Motorista\n3 - Limpeza do local\n4 - Limpeza dos animais\n5 - Outro");
				int funcao = sc.nextInt();
				
				System.out.println("situação:\n1 - Ativo\n2 - Pausado\n3 - Desativo");
				int situacao = sc.nextInt();
				
				voluntarios.setNome(nome);
				voluntarios.setCpf(cpf);
				voluntarios.setTelefone(telefone);
				voluntarios.setSexo(sexo);
				voluntarios.setDisponibilidade(disponibilidade);
				voluntarios.setFuncao(funcao);
				voluntarios.setSituacao(situacao);
				
				try {
					resgateAmigo.CadastrarVoluntario(voluntarios);
					System.out.println("voluntário cadastrado com sucesso!");
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
			
			// ALTERAR SITUAÇÃO DE UM VOLUNTÁRIO
			if (opcao == 9) {
				try {
					if (resgateAmigo.ListarTodosVoluntarios() == true) {
						Scanner scLine = new Scanner(System.in);
						System.out.println("Digite o CPF do voluntario:");
						String cpf = scLine.nextLine();
						resgateAmigo.AlterarSituacaoVoluntario(cpf);
					}
					else {
						System.out.println("Não existe voluntário no sistema.");
					}
					
				} catch (Exception e) {
					// TODO: handle exception
				}

			}
			
			// VERIFICAR VOLUNTÁRIOS ATIVOS
			if (opcao == 10) {
				if (resgateAmigo.ListarVoluntariosAtivos() == true) {
					
				}
				else {
					System.out.println("Nenhum voluntário ativo no momento.");
				}
			}
			
			// VERIFICAR VOLUNTÃ�RIOS COM PARTICIPAÃ‡ÃƒO PAUSADA
			if (opcao == 11) {
				if (resgateAmigo.ListarVoluntariosPausados() == true) {
					
				}
				else {
					System.out.println("Nenhum voluntário pausado no momento.");
				}
			}
			
			// VERIFICAR VOLUNTÁRIOS DESATIVOS
			if (opcao == 12) {
				if (resgateAmigo.ListarVoluntariosDesativos() == true) {
					
				}
				else {
					System.out.println("Nenhum voluntário desativo no momento");
				}
			}
			
			// CADASTRAR DOAÇÃO
			if (opcao == 13) {
				
				Doacoes doacoes = new Doacoes();
				Scanner scLine = new Scanner(System.in);
				
				System.out.println("Doador:");
				String nomeDoador = scLine.nextLine();
				
				System.out.println("CPF:");
				String cpfDoador = scLine.nextLine();
				
				try {
					System.out.println("Data Nascimento:");
					String dataNascDoador = scLine.nextLine();
					DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
					Date dt = df.parse(dataNascDoador);
					doacoes.setDataNascDoador(dt);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
				System.out.println("Telefone:");
				String telefoneDoador = scLine.nextLine();
				
				System.out.println("Email:");
				String emailDoador = scLine.nextLine();
				
				System.out.println("Tipo de doação:\n1 - Dinheiro\n2 - Material de limpeza\n3 - Itens para os animais\n4 - Itens para a ONG"
						+ "\n5 - Ração para gato\n6 - Ração para cachorro\n7 - Remédio\n8 - Vacina\n");
				
				int tipoDoacao = sc.nextInt();
				
				switch (tipoDoacao) {
				case 1: // DINHEIRO
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
						String valor = scLine.nextLine();
						doacoes.setDoacao(valor);
					}
					
					doacoes.setTipoDoacao("Dinheiro");

					break;
					// MATERIAL DE LIMPEZA
				case 2: 
					System.out.println("Material de Limpeza:");
					System.out.println("Digite qual material de limpeza você irá doar:");
					String material = scLine.nextLine();
					System.out.println("Digite a quantidade:");
					int qtdMaterial = sc.nextInt();
					
					doacoes.setTipoDoacao("Material de limpeza");
					doacoes.setDoacao(material);
					doacoes.setQtdDoacao(qtdMaterial);
					break;
					// IENS PARA ANIMAIS
				case 3: 
					System.out.println("Intens para animais");
					System.out.println("Digite qual item você deseja doar:");
					String itemA = scLine.nextLine();
					System.out.println("Digite a quantidade:");
					int qtdItemA = sc.nextInt();
					
					doacoes.setTipoDoacao("Itens para animais:");
					doacoes.setQtdDoacao(qtdItemA);
					doacoes.setDoacao(itemA);
					break;
					// itens para a ONG
				case 4: 
					System.out.println("Intens para a ONG");
					System.out.println("Digite qual item você irá doar:");
					String itemOng = scLine.nextLine();
					System.out.println("Digite a quantidade:");
					int qtdItemOng = sc.nextInt();
					
					doacoes.setTipoDoacao("Itens para a ONG");
					doacoes.setQtdDoacao(qtdItemOng);
					doacoes.setDoacao(itemOng);
					break;
					// RAÇÃO PARA GATO
				case 5: 
					System.out.println("Ração para gato");
					System.out.println("Digite a quantidade da ração");
					int qtdRacaoG = sc.nextInt();
					
					doacoes.setTipoDoacao("Ração para gato");
					doacoes.setQtdDoacao(qtdRacaoG);
					doacoes.setDoacao("Ração para gato");
					break;
					// RAÇÃO PARA CACHORRO
				case 6: 
					System.out.println("Ração para cachorro");
					System.out.println("Digite a quantidade da ração");
					int qtdRacaoC = sc.nextInt();
					
					doacoes.setTipoDoacao("Ração para cachorro");
					doacoes.setQtdDoacao(qtdRacaoC);
					doacoes.setDoacao("Ração para cachorro");
					break;
					// REMÉDIO
				case 7: 
					System.out.println("Remédio");
					System.out.println("Digite o remédio que irá doar:");
					String remedio = scLine.nextLine();
					System.out.println("Digite a quantidade:");
					int qtdRemedio = sc.nextInt();
					
					doacoes.setTipoDoacao("Remédio");
					doacoes.setQtdDoacao(qtdRemedio);
					doacoes.setDoacao(remedio);
					break;
					// VACINA
				case 8: 
					System.out.println("Vacina");
					System.out.println("Digite a vacina que irá doar");
					String vacina = scLine.nextLine();
					System.out.println("Digite a quantidade");
					int qtdVacina = sc.nextInt();
					
					doacoes.setTipoDoacao("Vacina");
					doacoes.setQtdDoacao(qtdVacina);
					doacoes.setDoacao(vacina);
					
				default:
					break;
				}
				
				try {
					System.out.println("Data dessa doação:");
					String dataDoacao = scLine.nextLine();
					DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
					Date dt = df.parse(dataDoacao);
					doacoes.setDataDoacao(dt);
				} catch (Exception e) {
					e.printStackTrace();
					// TODO: handle exception
				}

				doacoes.setNomeDoador(nomeDoador);
				doacoes.setCpfDoador(cpfDoador);
				doacoes.setTelefoneDoador(telefoneDoador);
				doacoes.setEmailDoador(emailDoador);
				
				resgateAmigo.CadastrarDoacoes(doacoes);
				System.out.println("Doação cadastrada com sucesso!");
			}
			
			// VER DOAÇÕES
			if (opcao == 14) {
				System.out.println(resgateAmigo.ListarDoacoes());
			}
		}
		
		while (opcao != 0); {
			System.exit(0);
			sc.close();
		}
	}	
}