package com.sanvalero.feedback2.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Jugador extends Usuario {
	
	private int numeroCamiseta;
	private String posicionEquipo;
	
	private List<DetallesJugador> detalles;
	
	public Jugador(String idUsuario, String contraseņa, String nombre, String apellidos, LocalDate fechaNacimiento,
			String direccion, int telefono, int numeroCamiseta, String posicionEquipo) {
		super(idUsuario, contraseņa, nombre, apellidos, fechaNacimiento, direccion, telefono);
		this.numeroCamiseta = numeroCamiseta;
		this.posicionEquipo = posicionEquipo;
		
		detalles = new ArrayList<>();

	}
	
	public int getNumeroCamiseta() {
		return numeroCamiseta;
	}
	public void setNumeroCamiseta(byte numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}
	public String getPosicionEquipo() {
		return posicionEquipo;
	}
	public void setPosicionEquipo(String posicionEquipo) {
		this.posicionEquipo = posicionEquipo;
	}

	public List<DetallesJugador> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<DetallesJugador> detalles) {
		this.detalles = detalles;
	}
	
	public void editarDetallesJugador(int goles, int tarjetasRojas, int tarjetasAmarillas) {
		DetallesJugador detalle = new DetallesJugador(goles, tarjetasRojas, tarjetasAmarillas);
		detalles.add(detalle);
	}

	
}
