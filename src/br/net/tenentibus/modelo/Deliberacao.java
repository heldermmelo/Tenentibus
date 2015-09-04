package br.net.tenentibus.modelo;

import sun.util.calendar.LocalGregorianCalendar.Date;

public class Deliberacao {
	private Date dataPrevista;
	private String descricao;
	
	
	public Date getDataPrevista() {
		return dataPrevista;
	}
	public void setDataPrevista(Date dataPrevista) {
		this.dataPrevista = dataPrevista;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
}
