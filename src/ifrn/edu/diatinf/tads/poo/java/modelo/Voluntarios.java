package ifrn.edu.diatinf.tads.poo.java.modelo;

import java.util.Date;

public class Voluntarios {
	
	private String nome;
	private String telefone;
	private Date dataNascimento;
	private String sexo;
	private int disponibilidade;
	private int funcao;
	private int situacao;
	private String motivo;
	private String cpf;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void setDataNascimento(Date data) {
		this.dataNascimento = data;
	}
	public String getDataNascimento() {
		return this.dataNascimento.toString();
	}
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(int disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	public int getFuncao() {
		return funcao;
	}
	public void setFuncao(int funcao) {
		this.funcao = funcao;
	}
	public int getSituacao() {
		return situacao;
	}
	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
}
