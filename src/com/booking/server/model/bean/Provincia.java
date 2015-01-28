package com.booking.server.model.bean;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.NotPersistent;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.gwt.user.client.rpc.IsSerializable;

@PersistenceCapable
public class Provincia implements IsSerializable {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;
	@Persistent
	private String nombre;
	@Persistent
	private int estado;
	@Persistent
	private Date dateAdd;
	@Persistent
	private Date dateUpdate;
	@Persistent
	private Long version;
	@Persistent
	private Region region;
	@NotPersistent
	private String operacion;

}
