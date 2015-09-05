package br.net.tenentibus.test;



import org.junit.Test;

import br.net.tenentibus.util.HibernateUtils;

public class GeraTabela{
	
	@Test
	public void gerar(){
		HibernateUtils.getSessionFactory();
		HibernateUtils.getSessionFactory().close();
	
	}

}