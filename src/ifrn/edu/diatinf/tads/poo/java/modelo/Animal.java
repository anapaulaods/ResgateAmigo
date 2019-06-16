package ifrn.edu.diatinf.tads.poo.java.modelo;

public class Animal {
	
	private int id;
	private String nome;
	private String tipo;
	private String raca;
	private String situacao;
	private int vacina;
	private int castrado;
	private String dataChegada;
	private String dataAdocao;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public int getVacina() {
		return vacina;
	}

	public void setVacina(int vacina) {
		this.vacina = vacina;
	}

	public int getCastrado() {
		return castrado;
	}

	public void setCastrado(int castrado) {
		this.castrado = castrado;
	}

	public String getDataChegada() {
		return dataChegada;
	}

	public void setDataChegada(String dataChegada) {
		this.dataChegada = dataChegada;
	}

	public String getDataAdocao() {
		return dataAdocao;
	}

	public void setDataAdocao(String dataAdocao) {
		this.dataAdocao = dataAdocao;
	}
}
