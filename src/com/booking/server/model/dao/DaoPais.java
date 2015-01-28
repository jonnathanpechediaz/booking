package com.booking.server.model.dao;

import java.util.Collection;

import javax.jdo.PersistenceManager;

import com.booking.server.model.bean.Pais;
import com.booking.shared.BeanParametro;
import com.booking.shared.UnknownException;

public class DaoPais {
	private PersistenceManager pm;

	public DaoPais(PersistenceManager pm) {
		this.pm = pm;
	}

	public boolean mantenimiento(BeanParametro parametro)
			throws UnknownException {
		Querys query = new Querys(this.pm);
		return query.mantenimiento(parametro);
	}

	public Object getBean(Long id) throws UnknownException {
		Querys query = new Querys(this.pm);
		return query.getBean(Pais.class, id);
	}

	@SuppressWarnings("unchecked")
	public Collection<Pais> getListarBean() throws UnknownException {
		Querys query = new Querys(this.pm);
		Collection<Pais> lista = (Collection<Pais>) query
				.getListaBean(Pais.class);
		return lista;
	}
}
