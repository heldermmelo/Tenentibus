package br.net.tenentibus.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table (name = "bloco", uniqueConstraints = @UniqueConstraint(columnNames = {"id_bloco"} ))
public class Bloco {
    
	@Column(name = "id_bloco") @Id @GeneratedValue(strategy=GenerationType.AUTO )
	private int id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "numero_deaptdo")
	private int numerodeApartamento;
	
	
	public int getId(){
		return id;
		
	}
	
	public void  setId(int id){
		this.id = id;
	}
	
	public String getNome(){
	    return nome;
	
	}
	
    public void setNome(String nome){
    	this.nome = nome;
    }
    
    public int getNumeroDeApartamento(){
    	return numerodeApartamento;
    }
    
    public void setNumeroDeApartamento(int numerodeApartamento){
    	
    	this.numerodeApartamento = numerodeApartamento;
    }
    
}
	

