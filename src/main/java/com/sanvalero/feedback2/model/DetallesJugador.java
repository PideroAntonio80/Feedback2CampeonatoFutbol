package com.sanvalero.feedback2.model;

public class DetallesJugador {
	
	private short goles;
	private short tarjetasRojas;
	private short tarjetasAmarillas;
	
	public DetallesJugador(short goles, short tarjetasRojas, short tarjetasAmarillas) {
		super();
		this.goles = goles;
		this.tarjetasRojas = tarjetasRojas;
		this.tarjetasAmarillas = tarjetasAmarillas;
	}
	
	public short getGoles() {
		return goles;
	}
	public void setGoles(short goles) {
		this.goles = goles;
	}
	public short getTarjetasRojas() {
		return tarjetasRojas;
	}
	public void setTarjetasRojas(short tarjetasRojas) {
		this.tarjetasRojas = tarjetasRojas;
	}
	public short getTarjetasAmarillas() {
		return tarjetasAmarillas;
	}
	public void setTarjetasAmarillas(short tarjetasAmarillas) {
		this.tarjetasAmarillas = tarjetasAmarillas;
	}
	
}
