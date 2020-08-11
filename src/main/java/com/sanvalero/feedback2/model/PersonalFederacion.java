package com.sanvalero.feedback2.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonalFederacion extends Usuario {
	
	private String puestoTrabajo;
	private LocalDate fechaIncorporacion;
	private List<Jugador> jugadoresFederados;
	private List<Equipo> equiposFederacion;
	
	public PersonalFederacion(String idUsuario, String contraseña, String nombre, String apellidos,
			LocalDate fechaNacimiento, String direccion, int telefono, String puestoTrabajo,
			LocalDate fechaIncorporacion) {
		super(idUsuario, contraseña, nombre, apellidos, fechaNacimiento, direccion, telefono);
		this.puestoTrabajo = puestoTrabajo;
		this.fechaIncorporacion = fechaIncorporacion;
		jugadoresFederados = new ArrayList<>();
		equiposFederacion = new ArrayList<>();
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
	
	public List<Jugador> getJugadoresFederados() {
		return jugadoresFederados;
	}

	public void setJugadoresFederados(List<Jugador> jugadoresFederados) {
		this.jugadoresFederados = jugadoresFederados;
	}

	public List<Equipo> getEquiposFederacion() {
		return equiposFederacion;
	}

	public void setEquiposFederacion(List<Equipo> equiposFederacion) {
		this.equiposFederacion = equiposFederacion;
	}
	
	public void registrarJugador(Jugador jugador) {
		jugadoresFederados.add(jugador);
	}
	
	public void eliminarJugador(Jugador jugador) {
		jugadoresFederados.remove(jugador);
	}
	
	public void registrarEquipo(Equipo equipo) {
		equiposFederacion.add(equipo);
	}
	
	public void eliminarEquipo(Equipo equipo) {
		equiposFederacion.remove(equipo);
	}

}
