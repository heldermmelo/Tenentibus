package br.net.tenentibus.modelo;

public class Morador {
	
	private String cpf;
	private String nome;
	private String email;//será a chave de condomino
	private boolean condomino;

	
	
	
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	

}
