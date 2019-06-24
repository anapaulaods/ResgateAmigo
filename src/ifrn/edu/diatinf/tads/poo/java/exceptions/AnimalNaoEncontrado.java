package ifrn.edu.diatinf.tads.poo.java.exceptions;

public class AnimalNaoEncontrado extends Exception{

	public AnimalNaoEncontrado() {
        System.err.println("Desculpe, não encontramos esse animal.");
    }
}