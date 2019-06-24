package ifrn.edu.diatinf.tads.poo.java.exceptions;

public class VoluntarioJaCadastrado extends Exception {
	
	// Será identificado pelo CPF (CPF já cadastrado)
	public VoluntarioJaCadastrado() {
		System.err.println("CPF já cadastrado");
	}
	
}
