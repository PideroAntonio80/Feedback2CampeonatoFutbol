package com.sanvalero.feedback2.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonalFederacion extends Usuario {
	
	private String puestoTrabajo;
	private LocalDate fechaIncorporacion;
	private List<Jugador> jugadores;
	private List<Equipo> equipos;
	
	public PersonalFederacion(String idUsuario, String contraseña, String nombre, String apellidos,
			LocalDate fechaNacimiento, String direccion, int telefono, String puestoTrabajo,
			LocalDate fechaIncorporacion) {
		super(idUsuario, contraseña, nombre, apellidos, fechaNacimiento, direccion, telefono);
		this.puestoTrabajo = puestoTrabajo;
		this.fechaIncorporacion = fechaIncorporacion;
		jugadores = new ArrayList<>();
		equipos = new ArrayList<>();
	}

	public String getPuestoTrabajo() {
		return puestoTrabajo;
	}

	public void setPuestoTrabajo(String puestoTrabajo) {
		this.puestoTrabajo = puestoTrabajo;
	}

	public LocalDate getFechaIncorporacion() {
		return fechaIncorporacion;
	}

	public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
		this.fechaIncorporacion = fechaIncorporacion;
	}
	
	public void registrarJugador(Jugador jugador) {
		jugadores.add(jugador);
	}
	
	public void eliminarJugador(Jugador jugador) {
		jugadores.remove(jugador);
	}
	
	public void registrarEquipo(Equipo equipo) {
		equipos.add(equipo);
	}
	
	public void eliminarEquipo(Equipo equipo) {
		equipos.remove(equipo);
	}

}
