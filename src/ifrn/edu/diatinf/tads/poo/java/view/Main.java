package ifrn.edu.diatinf.tads.poo.java.view;
import java.util.Scanner;

public class Main {
	
public static void Menu() {
		
		System.out.println("\n\n----- Menu do Sistema ----- ");
		System.out.println("\n|1| - Cadastrar animal");
		System.out.println("|2| - Adotar animal");
		System.out.println("|3| - Ver quantidade de animais");
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
		System.out.println("|14| - Cadastrar doa��es");
		System.out.println("|15| - Ver doa��es");
		System.out.println("|0| - Sair");
		System.out.print("\nDigite a op��o escolhida: ");
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		
		do {
			
			Menu();
			opcao = sc.nextInt();
			

			if (opcao == 1) {
				
			}
			
			if (opcao == 2) {
				
			}
			
			if (opcao == 3) {
				
			}
			
			if (opcao == 4) {
				
			}
			
			if (opcao == 5) {
				
			}
			
			if (opcao == 6) {
				
			}
			
			if (opcao == 7) {
				
			}
			
			if (opcao == 8) {
				
			}
			
			if (opcao == 9) {
				
			}
			
			if (opcao == 10) {
				
			}
			
			if (opcao == 11) {
				
			}
			
			if (opcao == 12) {
				
			}
			
			if (opcao == 13) {
				
			}
			
			if (opcao == 14) {
				
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
