package com.booking.client.service;

import com.booking.shared.UnknownException;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("servicegestionlocalidadmedios")
public interface ServiceGestionLocalidadMedios extends RemoteService {
	Boolean insertarUsuario() throws UnknownException;
}
