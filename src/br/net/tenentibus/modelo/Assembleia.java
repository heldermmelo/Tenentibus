package br.net.tenentibus.modelo;

import java.util.List;

import sun.util.calendar.LocalGregorianCalendar.Date;

public class Assembleia {
	
	private Date data;//chave
	private List<Pauta> pautas;
	private String definicao;// ordinaria ou extraordinaria?
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public List<Pauta> getPautas() {
		return pautas;
	}
	public void setPautas(List<Pauta> pautas) {
		this.pautas = pautas;
	}
	public String getDefinicao() {
		return definicao;
	}
	public void setDefinicao(String definicao) {
		this.definicao = definicao;
	}
	
	
	
	
	

}
