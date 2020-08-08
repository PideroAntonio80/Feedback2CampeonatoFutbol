package com.sanvalero.feedback2.model;

import java.time.LocalDate;

public class Mensaje {
	
	private String asunto;
	private LocalDate fecha;
	private String contenido;
	private boolean recibido;
	private Usuario emisor;
	private Usuario receptor;
	
	public Mensaje(String asunto, LocalDate fecha, String contenido, boolean recibido, Usuario emisor,
			Usuario receptor) {
		super();
		this.asunto = asunto;
		this.fecha = fecha;
		this.contenido = contenido;
		this.Recibido(recibido);
		this.emisor = emisor;
		this.receptor = receptor;
	}
	
	public String getAsunto() {
		return asunto;
	}
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public boolean Recibido() {
		return recibido;
	}
	public void Recibido(boolean recibido) {
		this.recibido = recibido;
	}
	public Usuario getEmisor() {
		return emisor;
	}
	public void setEmisor(Usuario emisor) {
		this.emisor = emisor;
	}
	public Usuario getReceptor() {
		return receptor;
	}
	public void setReceptor(Usuario receptor) {
		this.receptor = receptor;
	}

}
