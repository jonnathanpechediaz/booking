package com.booking.server.control.rpc;

import java.util.Date;

import com.booking.client.service.ServiceGestionLocalidadMedios;
import com.booking.server.model.bean.Pais;
import com.booking.server.model.process.GestionLocalidadMedios;
import com.booking.shared.UnknownException;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class ServiceGestionLocalidadMediosImpl extends RemoteServiceServlet
		implements ServiceGestionLocalidadMedios {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Boolean insertarUsuario() throws UnknownException {
		// TODO Auto-generated method stub
		Pais bean = new Pais();
		bean.setNombre("Peru2");
		bean.setEstado(1);
		bean.setDateAdd(new Date());
		bean.setOperacion("I");
		try {
			GestionLocalidadMedios.insertarPais(bean);
		} catch (UnknownException e) {
			// TODO Auto-generated catch block
			e.getLocalizedMessage();
		}
		return true;
	}

}
