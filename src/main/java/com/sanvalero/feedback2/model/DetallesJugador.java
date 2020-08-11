package com.sanvalero.feedback2.model;

public class DetallesJugador {
	
	private int goles;
	private int tarjetasRojas;
	private int tarjetasAmarillas;
	
	public DetallesJugador(int goles, int tarjetasRojas, int tarjetasAmarillas) {
		super();
		this.goles = goles;
		this.tarjetasRojas = tarjetasRojas;
		this.tarjetasAmarillas = tarjetasAmarillas;
	}
	
	public int getGoles() {
		return goles;
	}
	public void setGoles(int goles) {
		this.goles = goles;
	}
	public int getTarjetasRojas() {
		return tarjetasRojas;
	}
	public void setTarjetasRojas(int tarjetasRojas) {
		this.tarjetasRojas = tarjetasRojas;
	}
	public int getTarjetasAmarillas() {
		return tarjetasAmarillas;
	}
	public void setTarjetasAmarillas(int tarjetasAmarillas) {
		this.tarjetasAmarillas = tarjetasAmarillas;
	}
	
	public int totalFaltas(int tarjetasRojas, int tarjetasAmarillas) {
		int faltas = tarjetasRojas + tarjetasAmarillas;
		return faltas;
	}
	
}
