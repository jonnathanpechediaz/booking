package com.booking.client.front;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Booking implements EntryPoint {

	public void onModuleLoad() {
		RootPanel.get().add(new Button("Public"));
	}
}
