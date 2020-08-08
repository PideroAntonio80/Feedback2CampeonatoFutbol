package com.sanvalero.feedback2.model;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
	
	private String nombre;
	private String patrocinador;
	private String colorCamiseta1;
	private String colorCamiseta2;
	private String categoria;
	
	private List<Jugador> listaJugadores;
	private List<DetallesEquipo> detalles;
	
	public Equipo(String nombre, String patrocinador, String colorCamiseta1, String colorCamiseta2, String categoria) {
		super();
		this.nombre = nombre;
		this.patrocinador = patrocinador;
		this.colorCamiseta1 = colorCamiseta1;
		this.colorCamiseta2 = colorCamiseta2;
		this.categoria = categoria;
		
		listaJugadores = new ArrayList<>();
		detalles = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPatrocinador() {
		return patrocinador;
	}

	public void setPatrocinador(String patrocinador) {
		this.patrocinador = patrocinador;
	}

	public String getColorCamiseta1() {
		return colorCamiseta1;
	}

	public void setColorCamiseta1(String colorCamiseta1) {
		this.colorCamiseta1 = colorCamiseta1;
	}

	public String getColorCamiseta2() {
		return colorCamiseta2;
	}

	public void setColorCamiseta2(String colorCamiseta2) {
		this.colorCamiseta2 = colorCamiseta2;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public List<DetallesEquipo> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<DetallesEquipo> detalles) {
		this.detalles = detalles;
	}
	
	public void listaJugadores(Jugador jugador) {
		listaJugadores.add(jugador);
	}
	
	public void eliminarJugador(Jugador jugador) {
		listaJugadores.remove(jugador);
	}
	
	public void editarDetallesEquipo(short partidosDisputados, short victorias, short derrotas, short empates, short posicionRanking) {
		DetallesEquipo detalle = new DetallesEquipo(partidosDisputados, victorias, derrotas, empates, posicionRanking);
		detalles.add(detalle);
	}
	
}
