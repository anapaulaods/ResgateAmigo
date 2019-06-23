package ifrn.edu.diatinf.tads.poo.java.modelo;

import java.util.Date;

public class Doacoes {
	
	private String nomeDoador;
	private String cpfDoador;
	private String dataNascDoador;
	private String telefoneDoador;
	private String emailDoador;
	private String tipoDoacao;
	private String doacao;
	private int qtdDoacao;
	private Date dataDoacao;
	
	public String getNomeDoador() {
		return nomeDoador;
	}
	public void setNomeDoador(String nomeDoador) {
		this.nomeDoador = nomeDoador;
	}
	
	public String getCpfDoador() {
		return cpfDoador;
	}
	public void setCpfDoador(String cpfDoador) {
		this.cpfDoador = cpfDoador;
	}
	
	public String getDataNascDoador() {
		return dataNascDoador;
	}
	public void setDataNascDoador(String dataNascDoador) {
		this.dataNascDoador = dataNascDoador;
	}
	
	public String getTelefoneDoador() {
		return telefoneDoador;
	}
	public void setTelefoneDoador(String telefoneDoador) {
		this.telefoneDoador = telefoneDoador;
	}
	
	public String getEmailDoador() {
		return emailDoador;
	}
	public void setEmailDoador(String emailDoador) {
		this.emailDoador = emailDoador;
	}
	
	public String getTipoDoacao() {
		return tipoDoacao;
	}
	public void setTipoDoacao(String tipoDoacao) {
		this.tipoDoacao = tipoDoacao;
	}
	
	public String getDoacao() {
		return doacao;
	}
	public void setDoacao(String doacao) {
		this.doacao = doacao;
	}
	
	public int getQtdDoacao() {
		return qtdDoacao;
	}
	public void setQtdDoacao(int qtdDoacao) {
		this.qtdDoacao = qtdDoacao;
	}
	
	public String getDataDoacao() {
		return this.dataDoacao.toString();
	}
	public void setDataDoacao(Date dataDoacao) {
		this.dataDoacao = dataDoacao;
	}
}
