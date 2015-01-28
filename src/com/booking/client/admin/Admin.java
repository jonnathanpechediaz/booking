package com.booking.client.admin;

import com.booking.client.service.ServiceGestionLocalidadMedios;
import com.booking.client.service.ServiceGestionLocalidadMediosAsync;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class Admin implements EntryPoint {
	private final ServiceGestionLocalidadMediosAsync SERVICE = GWT
			.create(ServiceGestionLocalidadMedios.class);

	@Override
	public void onModuleLoad() {
		// TODO Auto-generated method stub
		Button btn = new Button("Admin");
		btn.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				// Window.alert("OK");
				SERVICE.insertarUsuario(new AsyncCallback<Boolean>() {

					@Override
					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub

					}

					@Override
					public void onSuccess(Boolean result) {
						// TODO Auto-generated method stub
						Window.alert("Susses");
					}

				});
			}

		});
		RootPanel.get().add(btn);
	}
}
