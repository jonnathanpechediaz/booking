package com.booking.server.model.process;

import java.util.logging.Logger;

import javax.jdo.PersistenceManager;
import javax.jdo.Transaction;

import com.booking.server.model.bean.Pais;
import com.booking.server.model.dao.PMF;
import com.booking.server.model.logic.LogicPais;
import com.booking.shared.BeanParametro;
import com.booking.shared.UnknownException;

public class GestionLocalidadMedios {
	private static final Logger LOG = Logger
			.getLogger(GestionLocalidadMedios.class.getName());

	public static Boolean insertarPais(Pais bean) throws UnknownException {
		if (bean.getOperacion().equalsIgnoreCase("I") && bean.getId() == null) {
			BeanParametro parametro = new BeanParametro();
			parametro.setBean(bean);
			parametro.setTipoOperacion(bean.getOperacion());
			PersistenceManager pm = null;
			Transaction tx = null;
			try {
				pm = PMF.getPMF().getPersistenceManager();
				tx = pm.currentTransaction();
				tx.begin();
				LogicPais logic = new LogicPais(pm);
				Boolean result = logic.mantenimiento(parametro);
				if (result) {
					tx.commit();
					pm.close();
					return true;
				} else {
					tx.rollback();
					pm.close();
					return false;
				}
			} catch (Exception ex) {
				LOG.warning(ex.getMessage());
				LOG.info(ex.getLocalizedMessage());
				throw new UnknownException(ex.getMessage());
			} finally {
				if (!pm.isClosed()) {
					if (tx.isActive()) {
						tx.rollback();
					}
					pm.close();
				}
			}
		} else {
			throw new UnknownException("Verifique Catalogo de Servicio");
		}
	}

	/*
	 * public static void main(String[] args) { Date fecha = new Date(); Pais
	 * bean = new Pais(); // bean.setId(new Long(1)); bean.setNombre("Peru");
	 * bean.setEstado(1); bean.setDateAdd(fecha); bean.setOperacion("I");
	 * bean.setVersion(fecha.getTime()); try { boolean rs = insertarPais(bean);
	 * if (rs) { System.out.print("Ok"); } else { System.out.print("err"); } }
	 * catch (UnknownException e) { // TODO Auto-generated catch block
	 * System.out.print(e.getMessage()); }
	 * 
	 * }
	 */
}
