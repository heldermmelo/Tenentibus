package br.net.tenentibus.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "condominio",  uniqueConstraints = @UniqueConstraint(columnNames = {"id_condominio"}))
public class Condominio {
	
	@Column (name = "id_condomonio")  @Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column (name = "numero_deblocos")
	private int numeroDeBlocos;
	@Column (name = "nome")
	private String nome;
	@Column (name = "numero_deapto")
	private int numeroDeApartamentos;
	
	
	public int getNumeroDeBlocos() {
		return numeroDeBlocos;
	}
	public void setNumeroDeBlocos(int numeroDeBlocos) {
		this.numeroDeBlocos = numeroDeBlocos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
