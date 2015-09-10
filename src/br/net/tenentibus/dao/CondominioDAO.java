package br.net.tenentibus.dao;

import br.net.tenentibus.modelo.Condominio;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import br.net.tenentibus.util.HibernateUtils;

public class CondominioDAO {

	public void salvar(Condominio condominio)throws HibernateException{
		Session sessao = HibernateUtils.getSessionFactory().openSession();
		Transaction transacao = null;
		
		try {
			transacao = sessao.beginTransaction();
			sessao.save(condominio);
			transacao.commit();
			
		} catch (HibernateException e) {
			if (transacao != null) {
				transacao.rollback();
			}
			throw e;
		} finally {
			sessao.close();
		}
	}
	
}
