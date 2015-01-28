package com.booking.server.model.logic;

import java.util.Collection;

import javax.jdo.PersistenceManager;

import com.booking.server.model.bean.Pais;
import com.booking.server.model.dao.DaoPais;
import com.booking.shared.BeanParametro;
import com.booking.shared.UnknownException;

public class LogicPais {

	private PersistenceManager pm;

	public LogicPais(PersistenceManager pm) {
		this.pm = pm;
	}

	public boolean mantenimiento(BeanParametro parametro)
			throws UnknownException {
		DaoPais dao = new DaoPais(this.pm);
		return dao.mantenimiento(parametro);
	}

	/*
	 * public Object getBean(String id) throws UnknownException { DaoPais dao =
	 * new DaoPais(this.pm); return dao.getBean(KeyFactory.stringToKey(id)); }
	 */

	public Object getBean(Long id) throws UnknownException {
		DaoPais dao = new DaoPais(this.pm);
		return dao.getBean(id);
	}

	public Collection<Pais> getListarBean() throws UnknownException {
		DaoPais dao = new DaoPais(this.pm);
		Collection<Pais> lista = dao.getListarBean();
		return lista;
	}
}
