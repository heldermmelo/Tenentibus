package br.net.tenentibus.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.net.tenentibus.modelo.Morador;
import br.net.tenentibus.util.HibernateUtils;

public class MoradorDAO {
	
	public void salvar(Morador morador)throws HibernateException{
		Session sessao = HibernateUtils.getSessionFactory().openSession();
		Transaction transacao = null;
		
		try {
			transacao = sessao.beginTransaction();
			sessao.save(morador);
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


