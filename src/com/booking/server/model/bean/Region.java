package com.booking.server.model.bean;

import java.io.Serializable;
import java.util.Date;

import javax.jdo.annotations.NotPersistent;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@PersistenceCapable
public class Region implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PrimaryKey
	@Persistent
	private Key id;
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
	private Pais pais;
	/*
	 * @Persistent(mappedBy = "provincia") private List<Provincia>
	 * listProvincia;
	 */
	@NotPersistent
	private String operacion;

	public String getId() {
		return KeyFactory.keyToString(id);
	}

	public void setId(String idPais) {
		// this.idCliente = idCliente;
		Key idP = KeyFactory.stringToKey(idPais);
		this.id = KeyFactory.createKey(idP, Region.class.getSimpleName(),
				java.util.UUID.randomUUID().toString());
		// this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Date getDateAdd() {
		return dateAdd;
	}

	public void setDateAdd(Date dateAdd) {
		this.dateAdd = dateAdd;
	}

	public Date getDateUpdate() {
		return dateUpdate;
	}

	public void setDateUpdate(Date dateUpdate) {
		this.dateUpdate = dateUpdate;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	/*
	 * public List<Provincia> getListProvincia() { return listProvincia; }
	 * 
	 * public void setListProvincia(List<Provincia> listProvincia) {
	 * this.listProvincia = listProvincia; }
	 */

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

}
