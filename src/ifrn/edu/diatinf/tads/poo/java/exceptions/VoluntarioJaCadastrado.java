package ifrn.edu.diatinf.tads.poo.java.exceptions;

public class VoluntarioJaCadastrado extends Exception {
	
	// Ser� identificado pelo CPF (CPF j� cadastrado)
	public VoluntarioJaCadastrado() {
		System.err.println("CPF j� cadastrado");
	}
	
}
