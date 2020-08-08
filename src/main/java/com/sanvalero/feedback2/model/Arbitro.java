package com.sanvalero.feedback2.model;

import java.time.LocalDate;

public class Arbitro extends Usuario {
	
	private LocalDate fechaInicio;
	private short numeroPartidos;
	
	public Arbitro(String idUsuario, String contraseña, String nombre, String apellidos, LocalDate fechaNacimiento,
			String direccion, int telefono, LocalDate fechaInicio, short numeroPartidos) {
		super(idUsuario, contraseña, nombre, apellidos, fechaNacimiento, direccion, telefono);
		this.fechaInicio = fechaInicio;
		this.numeroPartidos = numeroPartidos;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public short getNumeroPartidos() {
		return numeroPartidos;
	}

	public void setNumeroPartidos(short numeroPartidos) {
		this.numeroPartidos = numeroPartidos;
	}
	
}
