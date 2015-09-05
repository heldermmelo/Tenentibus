package br.net.tenentibus.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "morador", uniqueConstraints = @UniqueConstraint(columnNames = {"id_morador"}))
public class Morador {
	
@Column(name="id_morador") @Id @GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	@Column(name = "login",unique=true) 
	private String login;//será a chave de condomino
	
	@Column(name="email_morador", length=50)
	private String email;
	
	@Column(name="cpf_morador")
	private String cpf;
	
	@Column(name="nome_morador")
	private String nome;
	
	@Column(name="se_E_Condomino")
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
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public boolean isCondomino() {
		return condomino;
	}
	public void setCondomino(boolean condomino) {
		this.condomino = condomino;
	}

	

}
